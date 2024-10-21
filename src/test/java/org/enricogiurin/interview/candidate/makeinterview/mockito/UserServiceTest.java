package org.enricogiurin.interview.candidate.makeinterview.mockito;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


//write the unit test by mocking UserRepository
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
  @Mock
  UserRepository userRepository;

  UserService userService;


  @Test
  void business(){
    //write the unit test by mocking UserRepository
  }




  @BeforeEach
  void setUp() {
    this.userService = new UserService(userRepository);

  }
}

@RequiredArgsConstructor
class UserService {
  private final UserRepository userRepository;

  User business(String username){
    Optional<User> optional = userRepository.finByUser(username);
    if(optional.isPresent()){
      return optional.get();
    }
    throw new RuntimeException("user not present: "+username);
  }
}

interface UserRepository {
  Optional<User> finByUser(String username);
}


class User {
  public String getUsernme() {
    return usernme;
  }
  private String usernme;

  public User(String usernme) {
    this.usernme = usernme;
  }
}

/*
  //DO NOT COPY!!
  @Test
  void business_solution(){
    //write the unit test by mocking UserRepository
    when(userRepository.finByUser(any())).thenReturn(Optional.of(new User("enrico")));
  }
 */