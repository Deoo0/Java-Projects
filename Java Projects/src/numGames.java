import java.util.Scanner;
import java.util.Random;

public class numGames{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randNumber = rand.nextInt(100) + 1;

        System.out.println("Welcome to number Guessing Game\nEnter Guess: ");

        while (true) {
            
        
        int guess = input.nextInt();
        
        if (guess == randNumber){
            System.out.println("CORRECT, CONRATULATIONS YOU WIN");
            break;
        }

        else if (guess > randNumber){
            System.out.println("WRONG, the number is LOWER\ntry again.");
        }
        else{
                System.out.println("WRONG, the number is HIGHER\ntry again.");
        }
    }
    input.close();
    }


}

