import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertTimeToSecond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] arrString = input.trim().split(":");
        if (arrString[0].length() != 2 || arrString[1].length() != 2 || arrString[2].length() != 2) {
            System.out.println("INCORRECT");
            return;
        }
        int[] arrInt = new int[3];
        for (int i = 0; i < arrString.length; i++) {
            arrInt[i] = Integer.parseInt(arrString[i]);
        }
        if(arrInt[0]>23 || arrInt[1] >59 || arrInt[2] > 60) {
            System.out.println("INCORRECT");
        } else System.out.println(arrInt[0] *3600 + arrInt[1] * 60 +arrInt[2]);

    }
}
