package edu.cnm.deepdive;

/*
This converts your Earth weight what it would be on the Moon.
 */

import java.util.Scanner;

public class MoonWeight {

  public static void main(String[] args) {
    double weight;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Earth Weight: ");
    while (scanner.hasNextDouble()) {
      weight = scanner.nextDouble();
      double moonWeight = weight * .17;
      System.out.printf("Your weight on Mars would be: " + moonWeight);
      System.out.println("Earth Weight: ");
    }


  }
}
