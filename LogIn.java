package beginning;
import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = inp.nextLine();
        System.out.print("Enter your password: ");
        String password = inp.nextLine();

        if (userName.equals("username") && password.equals("password")) {
            System.out.print("Successfully logged in.");
        } else {
            System.out.println("Invalid username or password.");
            System.out.print("If you want to reset password, enter 1. ");
            int reset = inp.nextInt();
            if (reset == 1) {
                Scanner inp1 = new Scanner(System.in);
                System.out.print("Enter your new password: ");
                String newPassword = inp1.nextLine();
                if (newPassword.equals("password")) {
                    System.out.print("New password cannot be same with the old one.");
                } else {
                    System.out.print("New password created.");
                }
            } else {
                System.out.println("Try again.");
            }
        }
    }
}
