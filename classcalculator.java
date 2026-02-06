import java.util.Scanner;
public class classcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1: System.out.println("Sum = " + (a + b)); break;
            case 2: System.out.println("Difference = " + (a - b)); break;
            case 3: System.out.println("Product = " + (a * b)); break;
            case 4: System.out.println("Division = " + (a / b)); break;
            case 5: System.out.println("Modulus = " + (a % b)); break;
            default: System.out.println("Invalid Choice");
        }
    }
}
