package org.enricogiurin.interview.candidate.makeinterview.designpatterns.builder;

public class Main {
  public static void main(String[] args) {
    UserDTOSolution user = new UserDTOSolution.Builder()
        .name("John Doe")
        .email("john.doe@example.com")
        .build();

    System.out.println("User Details:");
    System.out.println("Name: " + user.getName());
    System.out.println("Email: " + user.getEmail());
  }
}
