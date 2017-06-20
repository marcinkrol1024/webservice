package sages.bootcamp.git.webservice.service;

/**
 * Created by Pingwinek on 2017-06-20.
 */
public class BlazejNorysGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Pozdrawiam"+name;
    }
}
