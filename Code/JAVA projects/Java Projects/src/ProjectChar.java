import java.util.Scanner;

public class ProjectChar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Character: ");
        String userInput = scan.next();
        int inputLength = userInput.length();
        char inputChar = userInput.charAt(0);
        int ascii = inputChar;

        while (inputLength != 1 || ascii < 65 && ascii != 90 || ascii < 97 && ascii != 122) {
            System.out.println("\nInvalid");
            System.out.print("Please enter valid character: ");
            userInput = scan.next();
            inputLength = userInput.length();
            inputChar = userInput.charAt(0);
            ascii = inputChar;
        }
        if (userInput.equals("a") || userInput.equals("e") || userInput.equals("i") || userInput.equals("o")
                || userInput.equals("u")) {
            System.out.println("You entered a vowel");
        } else {
            System.out.println("You entered a consonant");
        }

    }

}
