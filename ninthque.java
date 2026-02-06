import java.util.Scanner;

public class ninthque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(result);
    }
}
