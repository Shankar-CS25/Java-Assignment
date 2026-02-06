import java.util.Scanner;
public class Firstque {

    static  int add(int x, int y) {
        while(y!=0){
            int carry =x&y;
            x = x^y;
            y =carry<<1;

        }

return x;
    }

   public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = add(x, y);
        System.out.println("Sum =" + sum);

}
}

