package prelim;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Integer: ");
        int num = input.nextInt();
        
        if(isEven(num)){
            System.out.println("The number is EVEN");
        }
        else {
            System.out.println("Number is not EVEN");
        }


        
    } 
    public static boolean isEven(int a){

        if ( a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    
}
