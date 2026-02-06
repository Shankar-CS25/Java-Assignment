import java.util.Scanner;
public class Fourthque {

    static int multiply(int a, int b) {
        int result = 0;
        boolean negative = false;

        if (a < 0) { a = -a; negative = !negative; }
        if (b < 0) { b = -b; negative = !negative; }

        while (b > 0) {
            if ((b & 1) == 1) {
                result = result + a;
            }
            a = a << 1;
            b = b >> 1;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Multiplication = " + multiply(a, b));
    }
}

