import java.util.Scanner;

import static java.lang.Math.*;

public class C_k_n {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - k + i);
            res = res / i;
        }
        System.out.println(res);



    }
}
