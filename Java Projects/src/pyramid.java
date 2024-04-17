import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x = "*";
        System.out.print("Enter integer: ");
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.print("\n");
            for(int y = num; y >= i; y--){
                System.out.print(x);
            }

        }
        scan.close();
    }
}
