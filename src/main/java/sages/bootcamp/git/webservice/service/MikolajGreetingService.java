package sages.bootcamp.git.webservice.service;

/**
 * Created by Anna on 2017-06-20.
 */
public class MikolajGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Dzień dobry " + name;
    }
}
