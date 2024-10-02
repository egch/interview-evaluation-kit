package org.enricogiurin.interview.candidate.makeinterview.mockito;

import java.util.Optional;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;


//write the unit test by mocking UserRepository
public class UserServiceTest {

  @Test
  void business(){
    //write the unit test by mocking UserRepository
  }

}

@RequiredArgsConstructor
class UserService {
  private final UserRepository userRepository;

  User business(String username){
    Optional<User> optional = userRepository.finByUser(username);
    if(optional.isEmpty()){
      return optional.get();
    }
    throw new RuntimeException("user not present: "+username);
  }
}

interface UserRepository {
  Optional<User> finByUser(String username);
}

@Data
class User {
  private String usernme;
}