import java.util.Scanner;

public class ConvertToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputText = new StringBuilder();
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            inputText.append(line).append("\n");

        }
        String upperCaseText = inputText.toString().toUpperCase();

        System.out.println(upperCaseText);
    }
}
