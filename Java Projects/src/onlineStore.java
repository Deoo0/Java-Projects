import java.util.Scanner;

public class onlineStore {
    static Scanner scan = new Scanner(System.in);
    static int itemPrice;
    static String response;

    public static void main(String[] args) {
        do {

            print("\nWelcome to B - Store\n");
            String[] items = { "Coffee", "Water", "Coke", "Sprite", "Beer" };
            int[] price = { 15, 20, 17, 17, 30 };
            for (int i = 0; i < 5; i++) {
                System.out.println(price[i] + "  - " + items[i]); // display items and price array
            }

            print("\nWhat do you want to purchase?");
            String userItem = scan.next().toLowerCase();
            System.out.print("Quantity = ");
            int quantity = scan.nextInt(); // ask for the quantity
            int fee = 0;
            int change = 0;
            int payment = 0;

            switch (userItem) {
                case ("coffee"): {
                    itemPrice = price[0];
                    Run(quantity, fee, change, payment);
                }
                    break;
                case ("water"): {
                    itemPrice = price[1];
                    Run(quantity, fee, change, payment);
                }
                    break;
                case ("coke"): {
                    itemPrice = price[2];
                    Run(quantity, fee, change, payment);
                }
                    break;
                case ("sprite"): {
                    itemPrice = price[3];
                    Run(quantity, fee, change, payment);
                }
                    break;
                case ("beer"): {
                    itemPrice = price[4];
                    Run(quantity, fee, change, payment);
                }
            }
            print("Do you want to purchase again?\n \"Yes\" or \"No\""); // ask if the user want to purchase again
            response = scan.next().toLowerCase();
        } while (response.matches("yes"));
    }

    static void print(String word) { // System.out.println();
        System.out.println(word);
    }

    static void Run(int quantity, int fee, int change, int payment) {
        fee = itemPrice * quantity; // compute fee
        System.out.println("\nAmount to pay = " + fee); // amount to pay

        System.out.print("Enter Payment: ");
        payment = scan.nextInt(); // enter payment

        while (payment < fee) {
            System.out.println("\nINSUFFICIENT PAYMENT!!\n");
            System.out.print("Enter Payment: ");
            payment = scan.nextInt();
        }
        change = payment - fee; // compute change
        System.out.println("Change = " + change + "\n"); // ouput change

        System.out.println("Confirm Parchase: \n\"Yes\"  -  \"Cancel\"\n");// confirmation of payment
        String confirm = scan.next().toLowerCase();
        if (confirm.matches("yes")) {
            System.out.println("\nPayment recieved<3\nThank you for your purchase!\n");
        } else if (confirm.matches("cancel")) {
            System.out.println("\nCancel confirmed\nThank you\n");
        }

    }

}