import java.util.Scanner;

public class TextReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        String p3 = scanner.nextLine();
        String[] texts = p3.trim().split(" ");
        for (int i = 0; i < texts.length; i++) {
            if(texts[i].equals(p1)) texts[i] = p2;
        }

        p3 = String.join(" ",texts);
        System.out.println(p3);

    }
}
