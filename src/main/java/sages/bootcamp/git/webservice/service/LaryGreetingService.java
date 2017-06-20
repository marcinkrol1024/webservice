package sages.bootcamp.git.webservice.service;

/**
 * Created by Sysia on 2017-06-20.
 */
public class LaryGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "hej"+name;
    }
}
