package sages.bootcamp.git.webservice.service;

/**
 * Created by sim1 on 20.06.2017.
 */
public class RafalLeszczynskiGreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        return "Pozdrawiam Rafał" + name;
    }
}
