package example;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number: ");
            int a = scanner.nextInt();

            System.out.println("Please enter the second number: ");
            int b = scanner.nextInt();

            Calculator calculator = new Calculator();
            System.out.println("The sum is: " + calculator);
        } catch (NumberFormatException e){
            System.out.println("Enter only a number!");
        }catch (Exception e){
            System.out.println("Unknown error! " +e.getMessage());
        }finally {
            System.out.println("Program finished!");

        }

    }
}
