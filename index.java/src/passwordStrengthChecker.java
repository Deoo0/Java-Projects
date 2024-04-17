import java.util.Scanner;

public class passwordStrengthChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi! \n\nPlease Enter your name:");
        String name = scan.next();

        System.out.println("\nWelcome " + name + "!");
        System.out
                .println("Lets check the stregnth of your password \n\nDo you wish to continue?\n\"Yes\" or \"No\"");
        String response = scan.next().toUpperCase();

        if (response.matches("YES")) {
            System.out.println("Please Enter your Password");

        } else if (response.matches("NO")) {
            System.out.println("You pressed No");
        } else {
            System.out.println("Please enter appropriate response \"Yes\" or \"No\"");
        }

    }
}