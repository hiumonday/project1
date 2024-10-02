import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BasicQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        String block1 = "*";
        String block2 = "***";


        String cmd = scanner.next();
        while(!cmd.equals(block1))
        {
            System.out.println("Khong hop le");
            cmd = scanner.nextLine();
        }
        while(true){
            cmd = scanner.next();
            if (cmd.equals(block2)) break;
            switch (cmd) {
                case "find-max":
                    findMax(array);
                    break;
                case "find-min":
                    findMin(array);
                    break;
                case "sum":
                    sum(array);
                    break;
                case "find-max-segment":
                    int i = scanner.nextInt();
                    int j = scanner.nextInt();
                    findMaxSegment(array,i,j);
                    break;
                default:
                    System.out.println("Khong hop le");
            }
        }

    }

    public static void findMax(int[] array){

        System.out.println(Arrays.stream(array).max().getAsInt());
    }

    public static void findMin(int[] array){
        System.out.println(Arrays.stream(array).min().getAsInt());
    }

    public static void sum(int[] array){
        System.out.println(Arrays.stream(array).sum());
    }

    public static void findMaxSegment(int[] array, int i, int j){
        int[] newArray = new int[j - i + 1];
        int count = 0;
        for (int k = i-1; k < j; k++){
            newArray[count] = array[k];
            count++;
        }
        System.out.println(Arrays.stream(newArray).max().getAsInt());
    }
}
