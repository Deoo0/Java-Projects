import java.util.Scanner;

public class lawrenceDeo {
    static String confirmation;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("How many apples do you want to buy?");
            int numApples = scan.nextInt();
            int appleDozen = 45;
            int applePrice = 50;
            int totalPayment = 0;
            int payment = 0;
            int change = 0;
            if (numApples > 0) {
                totalPayment = (numApples - numApples % 12) * appleDozen + (numApples % 12) * applePrice;
                System.out.println("You need to pay: " + totalPayment);
            } else {
                System.out.println("Buy Something");
            }
            System.out.println("Pay here: ");
            payment = scan.nextInt();
            change = payment - totalPayment;
            while (change < 0) {
                System.out.println("\nPayment Insufficient\nEnter Valid Payment! \n");
                System.out.println("You need to pay: " + totalPayment);
                payment = scan.nextInt();
                change = payment - totalPayment;
            }

            System.out.println("Your change is: " + change);
            System.out.println("THANK YOU FOR BUYING!");
            System.out.println("\n Do you wish to purchase again?\n Yes or No?");
            confirmation = scan.next().toLowerCase();

        } while (confirmation.matches("yes"));

    }
}
