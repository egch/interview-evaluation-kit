package org.enricogiurin.interview.candidate.makeinterview.designpatterns;

public class Factory {

}

abstract class ProductFactory {

  public abstract Product createProduct();
}

class ConcreteProductFactoryA extends ProductFactory {

  @Override
  public Product createProduct() {
    return new Product();
  }
}

class ConcreteProductFactoryB extends ProductFactory {

  @Override
  public Product createProduct() {
    return new Product();
  }
}

class Product {

}