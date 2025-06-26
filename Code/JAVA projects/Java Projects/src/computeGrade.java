import java.util.Scanner;

public class computeGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Grade:");
        double grade1 = scan.nextInt();
        if (grade1 > 100) {
            System.out.println("Enter Valid Grade ");
        }

        System.out.println("Enter Second Grade:");
        double grade2 = scan.nextInt();
        if (grade2 > 100) {
            System.out.println("Enter Valid Grade ");
        }

        double finalGrade = (grade1 + grade2) / 2;

        System.out.println("Your final grade is " + finalGrade);

        if (finalGrade >= 96 || finalGrade == 100) {
            System.out.println("\nwith Highest Honor");

        } else if (finalGrade >= 90 || finalGrade == 95) {
            System.out.println("\nwith High Honor");

        } else if (finalGrade >= 85 || finalGrade == 90) {
            System.out.println("\nwith Honor");

        } else if (finalGrade >= 75) {
            System.out.println("\nPass");

        } else {
            System.out.println("\nFAIL");
        }

        if (finalGrade >= 80) {
            System.out.println("good job, you pass!");
        } else {
            System.out.println("you failed, try next time");
        }

    }
}
// 96-100 h
// 90-95 h
// 85-90 wh
// 75 above pass
// 74 below fail