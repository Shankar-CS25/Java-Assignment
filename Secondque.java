import java.util.Scanner;

public class Secondque {
    static int add(int a, int b){
        while (b!=0){
            int carry =a & b;
            a = a ^ b;
            b = carry << 1;

        }
        return a;
    }
     static int subtract(int a, int b){
        int negB = add(~b, 1);
        return add(a,negB);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = subtract(a, b);

        System.out.println("Subtraction =" + result);
    }

}

