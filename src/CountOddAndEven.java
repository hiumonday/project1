import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CountOddAndEven {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(input[i]);
            if (number % 2 == 0) countEven++;
            else countOdd++;
        }

        System.out.println(countOdd + " " + countEven);
    }
}
