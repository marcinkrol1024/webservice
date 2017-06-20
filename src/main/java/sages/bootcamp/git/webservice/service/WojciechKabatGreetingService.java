package sages.bootcamp.git.webservice.service;

public class WojciechKabatGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return  "Pozdrawiam " + name;
    }
}
