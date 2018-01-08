package io.hedwig.dp.demos.creation.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. author: patrick
 */
public class LoadBalancer {
//hungry
  private static LoadBalancer ourInstance = new LoadBalancer();
  private List<String> serverList = new ArrayList<>();

  public static LoadBalancer getInstance() {
    return ourInstance;
  }

  private LoadBalancer() {
  }

  public LoadBalancer registerServer(String serverName){
    this.serverList.add(serverName);
    return this;
  }

  public LoadBalancer unregisterServer(String serverName){
    this.serverList.remove(serverName);
    return this;
  }

  public String getServerName(String serverName){
    for (String s : serverList) {
      if(s.equalsIgnoreCase(serverName)){
        return s;
      }
    }
    return serverList.get(0);
  }
}
