package behavioral.country;

import java.util.Map;

public class Client {

  public static void main(String[] args) {

    final Map<String, CountryStrategy> strategies = Map.of(
        "Brazil", new BrazilCountryStrategy(),
        "Argentina", new ArgentinaCountryStrategy()
    );

    CountryService countryService = new CountryService(strategies);

    countryService.processRequest("Brazil");

    countryService.processRequest("Argentina");
  }
}
