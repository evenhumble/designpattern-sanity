package io.hedwig.dp.advanced.abstractdocument;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.hedwig.dp.advanced.abstractdocument.domain.Car;
import io.hedwig.dp.advanced.abstractdocument.domain.HasModel;
import io.hedwig.dp.advanced.abstractdocument.domain.HasParts;
import io.hedwig.dp.advanced.abstractdocument.domain.HasPrice;
import io.hedwig.dp.advanced.abstractdocument.domain.HasType;
import lombok.extern.slf4j.Slf4j;

/**
 * @@author: patrick
 */
@Slf4j
public class App {

  public App() {
    log.info("Constructing parts and cars");
    Map<String, Object> carProperties = new HashMap<>();
    carProperties.put(HasModel.PROPERTY, "300SL");
    carProperties.put(HasPrice.PROPERTY, 10000L);

    Map<String, Object> wheelProperties = new HashMap<>();
    wheelProperties.put(HasType.PROPERTY, "wheel");
    wheelProperties.put(HasModel.PROPERTY, "15C");
    wheelProperties.put(HasPrice.PROPERTY, 100L);

    Map<String, Object> doorProperties = new HashMap<>();
    doorProperties.put(HasType.PROPERTY, "door");
    doorProperties.put(HasModel.PROPERTY, "Lambo");
    doorProperties.put(HasPrice.PROPERTY, 300L);

    carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));

    Car car = new Car(carProperties);

    log.info("Here is our car:");
    log.info("-> model: {}", car.getModel().get());
    log.info("-> price: {}", car.getPrice().get());
    log.info("-> parts: ");
    car.getParts().forEach(
        p -> log.info("\t{}/{}/{}", p.getType().get(),
                      p.getModel().get(), p.getPrice().get()));
  }

  public static void main(String[] args) {
    new App();
  }
}
