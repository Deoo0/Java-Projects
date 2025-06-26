import java.util.Scanner;

public class Prac {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
                
        // Convert the string to an array of characters
        char[] charArray = str.toCharArray();
                
        // Print the array elements
        for(int i = 0; i >= str.length(); i++){
            if(charArray[0].match() charArray[-1]){
                System.out.println("First letter and last letter match");
            }
        }
            
        
    }
    
}
