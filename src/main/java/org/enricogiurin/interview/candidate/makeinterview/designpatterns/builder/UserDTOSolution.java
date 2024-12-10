package org.enricogiurin.interview.candidate.makeinterview.designpatterns.builder;


public class UserDTOSolution {
  // Private fields
  private final String name;
  private final String email;

  // Private constructor
  private UserDTOSolution(Builder builder) {
    this.name = builder.name;
    this.email = builder.email;
  }

  // Getter methods
  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  // Static nested Builder class
  public static class Builder {
    private String name;
    private String email;

    // Chained setter methods
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    // Build method to create a UserDTO instance
    public UserDTOSolution build() {
      return new UserDTOSolution(this);
    }
  }
}
