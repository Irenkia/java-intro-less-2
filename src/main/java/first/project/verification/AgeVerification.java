package first.project.verification;

public class AgeVerification {
    public static boolean verification(int age) {
        if(age >= 18 && age <= 100) {
            System.out.println("It's okay, come on in!");
            return true;
        } else{
            System.out.println("This movie is not suitable for your age!");
            return false;
        }
    }
}
