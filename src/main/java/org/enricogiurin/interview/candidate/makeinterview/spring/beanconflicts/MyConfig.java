package org.enricogiurin.interview.candidate.makeinterview.spring.beanconflicts;

import org.enricogiurin.interview.candidate.makeinterview.spring.beanconflicts.MyConfig.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyConfig {
  @Bean
  public Service serviceOne() {
    return new Service();
  }

  @Bean
  public Service serviceTwo() {
    return new Service();
  }

  public static class Service {}
}

@Component
class MyComponent {
  @Autowired
  private Service service;


}

@Component
class MyComponentSolution {
  private final Service service;

  @Autowired
  public MyComponentSolution(@Qualifier("serviceOne") Service service) {
    this.service = service; // Injects the 'serviceOne' bean
  }
}



//NoUniqueBeanDefinitionException: No qualifying bean of type 'Service' available: expected single matching bean but found 2: serviceOne, serviceTwo

