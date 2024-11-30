package org.enricogiurin.interview.candidate.makeinterview.spring.autowired;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
Q: How would you configure Spring to use a specific implementation of PaymentService in a component?
 */
@Service
public class PaymentManager {
  @Autowired

  private PaymentService paymentService;




}


/*

  public PaymentManager(@Qualifier PaymentService paymentService) {
    this.paymentService = paymentService;
  }

 */