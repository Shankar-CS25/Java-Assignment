import java.util.Scanner;

public class salarycalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra, da;

        if (basic >= 30000) {
            hra = basic * 0.20;
            da = basic * 0.15;
        } else {
            hra = basic * 0.10;
            da = basic * 0.08;
        }

        double pf = basic * 0.12;
        double netSalary = basic + hra + da - pf;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("PF = " + pf);
        System.out.println("Net Salary = " + netSalary);
    }
}
