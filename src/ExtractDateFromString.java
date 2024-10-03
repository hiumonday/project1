import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class ExtractDateFromString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String input = reader.readLine();
        String[] array = input.trim().split("-");
        if (array[0].length() != 4 || array[1].length() != 2 ||array[2].length() != 2) System.out.println("INCORRECT");
        else if (Integer.parseInt(array[1]) > 12 || Integer.parseInt(array[2]) > 31) {
            System.out.println("INCORRECT");
        } else for(String i : array) System.out.print(Integer.parseInt(i) + " ");

        }
    }
