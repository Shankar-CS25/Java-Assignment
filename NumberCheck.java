import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        if (n % 5 == 0 && n % 7 == 0)
            System.out.println("Divisible by 5 and 7");
        else
            System.out.println("Not divisible by 5 and 7");
    }
}

