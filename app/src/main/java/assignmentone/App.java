/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignmentone;

import java.util.Scanner;

/**
 * This is the main class for the assignment.
 */
public class App {
  private Scanner input;

  private App(Scanner scannerInput) {
    this.input = scannerInput;
  }

  /**
   * Solution to first task.
   */
  public String helloThere(){
  HelloThere hello = new HelloThere();
  System.out.print("Name, Please: ");
  String name = input.nextLine();
  System.out.println(hello.HelloThereName(name));
  return name;
  }

  /**
   * Solution for the second task.
   */
  public void seconds() {

  }

  /**
   * Solution for the third task.
   */
  public void imInaBand() {

  }

  /**
   * Solution for the fourth task.
   */
  public void bestAlbumsEver() {

  }

  /**
   * Solution for the fifth task.
   */
  public void workingWithArrays() {

  }

  /**
   * Starting point of the first assignment.
   *
   * @param args is not used.
   */
  public static void main(String[] args) {
    

    // we create a scanner object to work with
    // it is advised to create one and only one scanner for a specific stream in the whole application
    // scanners should be closed when you are done and this also closes the underlying stream
    Scanner consoleInput = new Scanner(System.in, "UTF-8");

    App app = new App(consoleInput);

    // Task 1
    // app.helloThere();

    // Task 2
    app.seconds();

    // Task 3
    //app.imInaBand();

    // Task 4 
    //app.bestAlbumsEver();

    // Task 5
    //app.workingWithArrays();

    // now we are exiting the application so time to close the scanner.
    consoleInput.close();
  }
}
