package io.hedwig.invserv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

  /**
   * Endpoint to retrieve a product's inventories.
   *
   * @return product inventory.
   */
  @RequestMapping(value = "/inventories")
  public int getProductInventories() {
    return 5;
  }

}