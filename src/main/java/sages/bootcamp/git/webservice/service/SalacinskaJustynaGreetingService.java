package sages.bootcamp.git.webservice.service;

/**
 * Created by 8760w on 2017-06-20.
 */
public class SalacinskaJustynaGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Pozdrawiam " + name;
    }
}
