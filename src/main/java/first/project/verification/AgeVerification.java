package first.project.verification;

import java.util.Scanner;

public class AgeVerification {
    static Scanner scanner = new Scanner(System.in);
    public static String verification() {
        System.out.println("Enter an age: ");
        int age;
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            if(age >= 18 && age <=100){
                return "It's okay, come on in!";
            }else {
                return "This movie is not suitable for your age!";
            }
        }else {
            return "You made a mistake when entering your age. Try again.";

        }
    }

}
