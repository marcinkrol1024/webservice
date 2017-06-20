package sages.bootcamp.git.webservice.service;

/**
 * Created by Jasiek on 20.06.2017.
 */
public class JanSkibniewskiGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Pozdrawiam Jan Skibniewski";
    }
}
