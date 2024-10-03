import java.util.Scanner;

public class Fibonanci {

    public static int fibonanci(int n) {
        int prev = 0;
        int dump;
        int res = 1;
        for (int i = 0; i < n-2; i++) {
            dump = res;
            res = res + prev;
            prev = dump;

        }
            return  res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonanci(n));
    }
}
