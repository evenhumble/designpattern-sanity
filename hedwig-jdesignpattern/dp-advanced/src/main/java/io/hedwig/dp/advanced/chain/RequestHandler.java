package io.hedwig.dp.advanced.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @@author: patrick
 */
@Slf4j
public abstract class RequestHandler {

  private RequestHandler next;
  public RequestHandler(RequestHandler next) {
    this.next = next;
  }

  public void handleRequest(Request req) {
    if (next != null) {
      next.handleRequest(req);
    }
  }

  protected void printHandling(Request req) {
    log.info("{} handling request \"{}\"", this, req);
  }

  @Override
  public abstract String toString();
}
