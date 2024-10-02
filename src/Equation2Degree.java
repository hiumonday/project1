import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Equation2Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double delta = b*b - 4*a*c;
        if(delta < 0 ) System.out.println("NO SOLUTION");
        else if (delta == 0) System.out.printf("%.2f", (double)(-b/(2*a)));
        else {
            double x1 = (-b + sqrt(delta))/(2*a);
            double x2 = (-b - sqrt(delta))/(2*a);

            System.out.printf("%.2f %.2f",x2,x1);
        }
    }
}
