package sages.bootcamp.git.webservice.service;

public class KacperBorzychGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Pozdrawiam wszystkich polaków" + name;
    }
}
