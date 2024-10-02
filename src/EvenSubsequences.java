import java.util.Scanner;

public class EvenSubsequences {

    public static int findEvenSub(int[] array, int k) {
        int initSum = 0;
        for (int i = 0; i < k; i++) initSum+=array[i];
        int count = 0;
        if (initSum % 2 ==0) count++;
        

        for (int i = k-1; i < array.length-1; i++) {
                initSum = initSum - array[i-k+1] + array[i+1];
                if (initSum % 2 == 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println(findEvenSub(array,k));
    }
}
