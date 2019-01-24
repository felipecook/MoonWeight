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
    while (scanner.hasNextInt()) {
      weight = scanner.nextInt();
      double moonWeight = weight * .17;
      System.out.printf("Your weight on Mars would be: %d", moonWeight);
      System.out.println("Earth Weight: ");
    }


  }
}
