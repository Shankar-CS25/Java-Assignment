import java.util.Scanner;

public class thirdque {

    static int divide(int dividend, int divisor) {

        if (divisor == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }

        boolean negative = false;
        if (dividend < 0) { dividend = -dividend; negative = !negative; }
        if (divisor < 0) { divisor = -divisor; negative = !negative; }

        int quotient = 0;

        while (dividend >= divisor) {
            int temp = divisor;
            int multiple = 1;

            while (dividend >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            dividend = dividend - temp;
            quotient = quotient + multiple;
        }

        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Quotient = " + divide(dividend, divisor));
    }
}
