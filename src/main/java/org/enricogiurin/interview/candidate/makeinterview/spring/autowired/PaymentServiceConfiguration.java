package org.enricogiurin.interview.candidate.makeinterview.spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentServiceConfiguration {

  @Bean
  public PaymentService creditCardPaymentService() {
    return new CreditCardPaymentService();
  }

  @Bean
  public PaymentService payPalPaymentService() {
    return new PayPalPaymentService();
  }

  // Static Inner Class for CreditCardPaymentService
  public static class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
      System.out.println("Processing credit card payment: " + amount);
    }
  }

  // Static Inner Class for PayPalPaymentService
  public static class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
      System.out.println("Processing PayPal payment: " + amount);
    }
  }
}