import java.util.Scanner;
public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n, reverse = 0, sum = 0, count = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            sum = sum + digit;
            count++;
            n = n / 10;
        }

        System.out.println("Reverse: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
    }
}
