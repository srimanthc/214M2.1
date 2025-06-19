package org.example;

import java.util.Scanner;

public class App {
  public Integer getInput(int lower, int upper, String prompt, String err) {
    Scanner scanner = new Scanner(System.in);
    int value;

    while (true) {
      System.out.print(prompt);
      String input = scanner.nextLine().trim();

      // Allow user to exit
      if (input.equalsIgnoreCase("exit")) {
        return null; // signifies user aborted
      }

      try {
        value = Integer.parseInt(input);
        if (value >= lower && value <= upper) {
          return value;
        } else {
          System.out.println(err);
        }
      } catch (NumberFormatException e) {
        System.out.println(err);
      }
    }
  }

  public static void main(String[] args) {
    App app = new App();

    Integer result = app.getInput(10, 100, "Please enter a number between 10 and 100 (or type \"exit\" to quit): ", "Invalid input. Please enter a number."
    );

    if (result == null) {
      // User exited
      return;
  }

    System.out.println("The value chosen by the user is " + result);
  }
}
