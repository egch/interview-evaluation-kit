package org.enricogiurin.interview.candidate.makeinterview.coding;

/*
You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 7.
The system is such that:

The first 2 characters consist of a code for passenger
The next character (single) denotes the gender of the person.
The following two characters are used to indicate the age of the person.
The last two characters determine the seat allotted to that person.
Return the number of passengers who are strictly more than 60 years old. (>60)

Example 1:

Input: details = ["78M7522","53F9211","92F4010"]
Output: 2
Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.
Example 2:

Input: details = ["13F2036","29M5644"]
Output: 0
Explanation: None of the passengers are older than 60.


Constraints:

1 <= details.length <= 100
details[i].length == 7
details[i] consists of digits from '0' to '9'.
details[i][2] is either 'M' or 'F' or 'O'.
 */


public class NumberOfSeniorCitizens {

  public int countSeniors(String[] details) {
    //write your solution here
    return 0;
  }


  public int countSeniors_solution(String[] details) {
    int counter = 0;
    for (String detail : details) {
      counter += (detail.charAt(3) - '0') * 10 + (detail.charAt(4) - '0') > 60 ? 1 : 0;
    }
    return counter;
  }

}
