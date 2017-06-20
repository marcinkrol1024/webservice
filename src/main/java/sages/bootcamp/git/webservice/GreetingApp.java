package sages.bootcamp.git.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sages.bootcamp.git.webservice.service.AggregateGreetingService;
import sages.bootcamp.git.webservice.service.GreetingService;
import sages.bootcamp.git.webservice.service.JanSkibniewskiGreetingService;

@SpringBootApplication
@RestController
public class GreetingApp {

  public static void main(String[] args) {
    SpringApplication.run(GreetingApp.class, args);
  }

  @Autowired
  private GreetingService greetingService;

  @RequestMapping("/greeting")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return greetingService.greet(name);
  }

  @Bean
  public GreetingService provideGreetingService() {
    return new AggregateGreetingService(new JanSkibniewskiGreetingService());
  }
}
