package sages.bootcamp.git.webservice.service;

import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class AggregateGreetingService implements GreetingService {

  private GreetingService[] greetingServices;

  public AggregateGreetingService(GreetingService... greetingServices) {
    this.greetingServices = greetingServices;
  }

  @Override
  public String greet(String name) {
    return stream(greetingServices)
        .map(greetingService -> greetingService.greet(name))
        .collect(Collectors.joining("<br>"));
  }
}
