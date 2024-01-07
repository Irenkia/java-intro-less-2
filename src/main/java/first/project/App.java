package first.project;

import first.project.calculator.Calculator;
import first.project.verification.AgeVerification;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Calculator
        do{
            int operand1 = Calculator.getInt();
            int operand2 = Calculator.getInt();
            char operation = Calculator.getOperation();
            int result = Calculator.calculating(operand1, operand2, operation);
            System.out.println("Result of the operation: " + operand1 +
                    " " + operation + " " + operand2 + " = " + result);
        }while (choice());
        //AgeVerification
        do{
            System.out.println("Enter an age: ");
            int age;
            boolean isVerification = true;
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                isVerification = AgeVerification.verification(age);
            }else {
                System.out.println("You made a mistake when entering your age. Try again.");
            }
            System.out.println("Your age to watch the film is " + isVerification);
        }while (choice());
    }

    public static boolean choice(){
        char choice;
        System.out.println("Do you want to continue?\n" +
                "Enter Y for yes or N for no : ");
        choice = scanner.next().charAt(0);
        return ((choice == 'y') || (choice == 'Y'));
    }
}