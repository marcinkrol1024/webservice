package sages.bootcamp.git.webservice.service;

/**
 * Created by Raynor on 2017-06-20.
 */
public class LukaszChodkowskiGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Pozdrowiam" + name;
    }
}
