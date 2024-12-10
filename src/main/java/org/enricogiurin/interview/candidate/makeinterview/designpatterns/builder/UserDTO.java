package org.enricogiurin.interview.candidate.makeinterview.designpatterns.builder;

import lombok.Data;


/*
ask Description:
You are required to design a UserDTO class that contains two fields:

String name
String email
The goal is to implement the Builder Pattern for this class. The Builder should:

Allow for setting the values of name and email using chained methods.
Include a build() method to construct an immutable UserDTO instance.
Ensure that the UserDTO class is immutable.
 */

@Data
class UserDTO {
  // Private fields
  private final String name;
  private final String email;


}

