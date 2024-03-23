package first.project.calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        System.out.println("Enter an integer: ");
        int operand;
        if(scanner.hasNextInt()){
            operand = scanner.nextInt();
        }else {
            System.out.println("You made a mistake when entering a number. Try again.");
            scanner.next();
            operand = getInt();
        }
        return operand;
    }
    public static char getOperation(){
        System.out.println("Enter operation (+, -, *, /): ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else {
            System.out.println("You made an error when entering an operation. Try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calculating(int operand1, int operand2, char operation){
        int result;
        switch (operation){
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if(operand2 == 0){
                    System.out.println("Error: You cannot divide by zero.");
                    result = 0;
                    break;
                }else {
                    result = operand1 / operand2;
                    break;
                }
            default:
                System.out.println("The operation was not recognized. Please re-enter.");
                result = 0;
                break;
        }
        return result;
    }

}
