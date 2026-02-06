import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "admin";
        String pass = "1234";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter username: ");
            String u = sc.next();

            System.out.print("Enter password: ");
            String p = sc.next();

            if (u.equals(user) && p.equals(pass)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong credentials");
            }

            if (i == 3) {
                System.out.println("Account Locked");
            }
        }
    }
}
