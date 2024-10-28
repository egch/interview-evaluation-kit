package org.enricogiurin.interview.candidate.makeinterview.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class UsageOfConfiguration {


}

@Configuration
class MyConfig {
  @Bean
  public String message1() {
    return "m1";

  }

  @Bean
  public String message2() {
    return "m2";

  }
}


//how to inject the specific string m1
@Component
class InjectedComponent {
  @Autowired

  private String message;

}


@Component
class InjectedComponentSolution {
  @Autowired
  @Qualifier("message1")
  private String message;

}




