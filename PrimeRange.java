import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean prime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    System.out.print(i + " ");
            }
        }
    }
}
