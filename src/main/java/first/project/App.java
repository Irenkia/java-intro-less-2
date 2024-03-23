package first.project;

import first.project.calculator.Calculator;
import first.project.checking.CheckingNumber;
import first.project.verification.AgeVerification;
import first.project.weekdays.Weekdays;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        forCalculator();
        forAgeVerification();
        forCheckingNumber();
        forWeekdays();
    }

    public static boolean choice(){
        char choice;
        System.out.println("Do you want to continue?\n" +
                "Enter Y for yes or N for no : ");
        choice = scanner.next().charAt(0);
        return ((choice == 'y') || (choice == 'Y'));
    }
    public static void forCalculator(){
        do{
            int operand1 = Calculator.getInt();
            int operand2 = Calculator.getInt();
            char operation = Calculator.getOperation();
            int result = Calculator.calculating(operand1, operand2, operation);
            System.out.println("Result of the operation: " + operand1 +
                    " " + operation + " " + operand2 + " = " + result);
        }while (choice());
    }
    public static void forAgeVerification(){
        do{
            System.out.println("Enter an age: ");
            int age;
            boolean isVerification;
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                isVerification = AgeVerification.isVerification(age);
                System.out.println("Your age to watch the film is " + isVerification);
            }else {
                System.out.println("You made a mistake when entering your age.");
            }
        }while (choice());
    }
    public static void forCheckingNumber(){
        do{
            System.out.println("Enter an integer: ");
            int number;
            boolean isEven;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isEven = CheckingNumber.isNumberEven(number);
                System.out.println("Your number " + number + " is Even? - " + isEven);
            }else {
                System.out.println("You made a mistake when entering your number.");
            }
        }while (choice());
    }
    public static void forWeekdays(){
        do{
            System.out.println("Enter a day week (an integer): ");
            int day;
            boolean isEven;
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                String isDay = Weekdays.days(day);
                System.out.println("Your day of week - " + isDay);
            }else {
                System.out.println("You made a mistake when entering your day of week.");
            }
        }while (choice());
    }

}