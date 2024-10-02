import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the entire input text (considering line breaks)
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine()).append(" ");
        }

        // Split the text into words by spaces, tabs, and line breaks
        String[] words = text.toString().trim().split("\\s+");

        // Output the number of words
        System.out.println(words.length);

        scanner.close();
    }
}
