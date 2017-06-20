package sages.bootcamp.git.webservice.service;

public class MarcinKrolGreetingService implements GreetingService {
  @Override
  public String greet(String name) {
    return "Pozdrawiam " + name;
  }
}
