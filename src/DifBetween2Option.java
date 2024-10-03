import java.util.Scanner;

public class DifBetween2Option {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int opt1, opt2;
        int[] limits1 = {0,50, 100, 200, 300, 400};
        double[] prices1 = {1.728, 1.786, 2.074, 2.612, 2.919, 3.015};

        int previous = n;
        int count;
        for (int i = 0; i < 6; i++) {
            if (previous > limits1[5-i]) {
                count = previous - limits1[5-i];
                previous = limits1[5-i];
                System.out.println(count);
            }
        }
    }
}
