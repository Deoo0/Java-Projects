package prelim;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two Intergers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        

        System.out.print("The sum is : " + getSum(x, y));
        
    }
public static int getSum( int a , int b){
    return a + b;
} 


}
