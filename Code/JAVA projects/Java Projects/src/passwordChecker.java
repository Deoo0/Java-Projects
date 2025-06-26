import javax.swing.JOptionPane;
import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String passwordInput = JOptionPane.showInputDialog(null, "Enter Password", "Account Login",
                    JOptionPane.QUESTION_MESSAGE);

            if (passwordInput.equals("145667532")) {
                JOptionPane.showMessageDialog(null, "Access Granted \n Welcome Lawrence", "Account Login",
                        JOptionPane.PLAIN_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Access Denied", "Account Login", JOptionPane.PLAIN_MESSAGE);
            }

        }
    }
}
