import java.util.Scanner;

public class salaryCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Estimated Salary per Hour:  ");
        int salaryHour = scan.nextInt();
        int salaryDay = salaryHour * 6;
        int salaryMonth = salaryDay * 17;
        int salaryYear = salaryMonth * 12;
        System.out.println("\nYour Salary per Day is: " + salaryDay +"\n");
        System.out.println("Your Salary per Month is: " + salaryMonth+"\n");
        System.out.println("Your Salary in a Year is: " + salaryYear);
    
    }
}
