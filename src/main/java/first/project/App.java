package first.project;

import first.project.calculator.Calculator;
import first.project.verification.AgeVerification;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;

        do{
            int operand1 = Calculator.getInt();
            int operand2 = Calculator.getInt();
            char operation = Calculator.getOperation();
            int result = Calculator.calculating(operand1, operand2, operation);
            System.out.println("Result of the operation: " + operand1 +
                    " " + operation + " " + operand2 + " = " + result);
            System.out.println("Do you want to continue?\n" +
                    "Enter Y for yes or N for no : ");
            choice = scanner.next().charAt(0);
        }while ((choice == 'y') || (choice == 'Y'));

        do{
            String ageVerification = AgeVerification.verification();
            System.out.println(ageVerification);
            System.out.println("Do you want to continue?\n" +
                    "Enter Y for yes or N for no : ");
            choice = scanner.next().charAt(0);
        }while ((choice == 'y') || (choice == 'Y'));
    }
}