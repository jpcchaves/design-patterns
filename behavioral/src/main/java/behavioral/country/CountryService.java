package behavioral.country;

import java.util.Map;
import java.util.Objects;

public class CountryService {

  private final Map<String, CountryStrategy> countryStrategies;

  public CountryService(Map<String, CountryStrategy> countryStrategies) {

    this.countryStrategies = countryStrategies;
  }

  public void processRequest(String country) {

    CountryStrategy strategy = countryStrategies.get(country);

    if (Objects.isNull(strategy)) {

      throw new IllegalArgumentException("Invalid strategy!");
    }

    strategy.processCountry();
  }
}
