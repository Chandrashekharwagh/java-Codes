package SwitchCase;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive integer number: ");
            int number = scanner.nextInt();

            switch (number % 2) {
                case 0:
                    System.out.println(number + " is an even number");
                    break;
                case 1:
                    System.out.println(number + " is an odd number");
                    break;
            }
        }
    }


