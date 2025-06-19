package org.example;

import java.util.Scanner;

public class App {
  public int getInput(int lower, int upper, String prompt, String err) {
    Scanner scanner = new Scanner(System.in);
    int value;

    while (true) {
      System.out.print(prompt);
      String input = scanner.nextLine().trim();

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

    int result = app.getInput(10, 100, "Please enter a number between 10 and 100: ", "Invalid input. Please enter a number."
    );

    System.out.println("The value chosen by the user is " + result);
  }
}
