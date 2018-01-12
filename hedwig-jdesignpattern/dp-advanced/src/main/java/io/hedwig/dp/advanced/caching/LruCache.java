package io.hedwig.dp.advanced.caching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import lombok.extern.slf4j.Slf4j;

/**
 * @@author: patrick
 */
@Slf4j
public class LruCache {

  public boolean contains(String userId) {
    return this.cache.containsKey(userId);
  }

  public static class Node {

    String userId;
    User user;
    Node previous;
    Node next;


    public Node(String userId, User user) {
      this.userId = userId;
      this.user = user;
    }
  }

  int capacity;
  Map<String, Node> cache = new ConcurrentHashMap<>();
  Node head, end;

  public LruCache(int capacity) {
    this.capacity = capacity;
  }

  public User get(String userId) {
    if (cache.containsKey(userId)) {
      Node node = cache.get(userId);
      remove(node);
      setHead(node);
      return node.user;
    }
    return null;
  }

  private void setHead(Node node) {
    node.next = head;
    node.previous = null;
    if (head != null) {
      head.previous = node;
    }

    head = node;
    if (end == null) {
      end = head;
    }
  }

  private void remove(Node node) {

    if (node.previous != null) {
      node.previous.next = node.next;
    } else {
      head = node.next;
    }

    if (node.next != null) {
      node.next.previous = node.previous;
    } else {
      end = node.previous;
    }
  }

  public void set(String userId, User user) {
    if (cache.containsKey(userId)) {
      Node old = cache.get(userId);
      old.user = user;
      remove(old);
      setHead(old);
    } else {
      Node newNode = new Node(userId, user);
      if (cache.size() >= capacity) {
        log.info("# Cache is FULL! Removing {} from cache...", end.userId);
        cache.remove(end.userId); // remove LRU data from cache.
        remove(end);
        setHead(newNode);
      } else {
        setHead(newNode);
      }
      cache.put(userId, newNode);
    }
  }

  public void invalidate(String userId) {
    Node toBeRemoved = cache.remove(userId);
    if (toBeRemoved != null) {
      log.info("# {} has been updated! Removing older version from cache...", userId);
      remove(toBeRemoved);
    }
  }

  public boolean isFull() {
    return cache.size() >= capacity;
  }

  public User getLruData() {
    return end.user;
  }

  /**
   * Clear cache
   */
  public void clear() {
    head = null;
    end = null;
    cache.clear();
  }

  /**
   * Returns cache data in list form.
   */
  public List<User> getCacheDataInListForm() {
    List<User> listOfCacheData = new ArrayList<>();
    Node temp = head;
    while (temp != null) {
      listOfCacheData.add(temp.user);
      temp = temp.next;
    }
    return listOfCacheData;
  }

  /**
   * Set cache capacity
   */
  public void setCapacity(int newCapacity) {
    if (capacity > newCapacity) {
      clear(); // Behavior can be modified to accommodate for decrease in cache size. For now, we'll
      // just clear the cache.
    } else {
      this.capacity = newCapacity;
    }
  }

}
