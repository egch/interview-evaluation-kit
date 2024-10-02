package org.enricogiurin.interview.candidate.makeinterview;

public class UsingFunctionalInterface {

  public static void main(String[] args) {
    TaskManager taskManager = new TaskManager();
    //How would you call the executeTask method by passing a Task using a lambda expression?"
  }



}


class TaskManager {
  void executeTask(Task task, String taskDescription) {
    task.perform(taskDescription); // perform the task with the provided description
  }

}
@FunctionalInterface
interface Task {
  void perform(String taskDescription);
}


