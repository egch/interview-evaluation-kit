package org.enricogiurin.interview.candidate.makeinterview.spring.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

}


@Service
class BookService {

  private final List<String> books = new ArrayList<>();


  public List<String> getBooks() {
    return books;
  }


  public void addBook(String book) {
    books.add(book);
  }
}

/*
Q. Complete the BookController class to have the following two RESTful methods working properly:

Fetch all books (GET /books):
This method should return a list of book titles in JSON format.
Add a new book (POST /books):
This method should accept a book title in the request body (as plain text or JSON) and add it to the list.

 */

/*
  @GetMapping("/{uuid}")
  ResponseEntity<WordView> findByUuid(@PathVariable UUID uuid) {
    WordView result = wordRepository.findByExternalId(uuid)
        .orElseThrow(
            () -> new DataNotFoundException("can't find Word having uuid: " + uuid));
    return ResponseEntity.ok(result);
  }

  @PostMapping
  ResponseEntity<WordView> add(@RequestBody Word word) {
    WordView savedProperty = wordRepository.create(word);
    return new ResponseEntity<>(savedProperty, HttpStatus.CREATED);
  }
 */