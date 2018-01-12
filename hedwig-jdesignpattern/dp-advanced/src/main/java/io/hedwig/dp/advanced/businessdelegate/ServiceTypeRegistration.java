package io.hedwig.dp.advanced.businessdelegate;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @@author: patrick
 */
public class ServiceTypeRegistration {

  public Map<String, ServiceType> registST = new HashMap<>();

  public void registServiceType(String name, ServiceType st) {
    registST.put(name, st);
  }

  public void init(){
    registST.put("EJB",EJB());
    registST.put("JMS",JMS());
  }

  @Data
  @AllArgsConstructor
  public static class ServiceType {

    private String name;
    private String type;
  }

  public static ServiceType EJB() {
    return new ServiceType("EJB", "EJB");
  }

  public static ServiceType JMS() {
    return new ServiceType("JMS", "JMS");
  }

  private ServiceType getServiceType(String name) {
    return registST.get(name);
  }
}
