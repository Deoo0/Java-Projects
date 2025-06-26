import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String givenInput = "good";

        int stringNum;

        System.out.println("Input String");
        String userInput = scan.next();
        int ascii = 0;
        int ascii2 = 0;

        for (int i = 0; i <= givenInput.length() - 1; i++) {
            char toChar = givenInput.charAt(i);
            ascii = toChar;

        }

        for (int i = 0; i <= userInput.length() - 1; i++) {
            char usertoChar = userInput.charAt(i);
            ascii2 = usertoChar;

        }

        System.out.print(ascii + " ");
        System.out.println(ascii2);
    }
}
