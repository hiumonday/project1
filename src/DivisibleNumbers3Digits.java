import java.util.Scanner;

public class DivisibleNumbers3Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 0;
        if (n < 100) {
            for (int i = 100; i <= 999; i++) {
                if (i % n == 0) {
                    start = i;
                    break;
                }
            }

            for (int i = start; i < 999; i+=n) {
                System.out.print(i + " ");
            }
        }
        else {
            for (int i = n; i <= 999; i+=n) {
                System.out.print(i + " ");
            }
        }
        }
    }
