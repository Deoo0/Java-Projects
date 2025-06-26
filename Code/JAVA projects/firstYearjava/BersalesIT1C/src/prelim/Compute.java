package prelim;
import java.util.Scanner;

public class Compute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two interger: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + minus(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));
        
    }

    public static int add(int x , int y){
        return x + y;
    }
    public static int minus(int x , int y){
        return x - y;
    }
    public static int multiply(int x , int y){
        return x * y;
    }
    public static double divide(double x , double y){
        return x / y;
    }
    
}
