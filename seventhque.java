import java.util.Scanner;

public class seventhque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int diff = a - b;
        int k = (diff >> 31) & 1;

        int max = a - k * diff;

        System.out.println("Maximum = " + max);
    }
}
