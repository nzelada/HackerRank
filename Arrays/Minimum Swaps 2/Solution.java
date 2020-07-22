import java.io.*;
import java.util.*;


public class Solution {

    // Complete the minimumSwaps function below.
      static int minimumSwaps(int[] array) {
        int n = array.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++) {
            if (i < array[i] - 1) {
                swap(array, i, Math.min(n, array[i] - 1));
                minSwaps++;
                i--;
            }
        }
        return minSwaps;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int[] newInt = new int[] {1,3,5,2,4,6,7};
       System.out.println();
       System.out.println("The number of swaps are: "+minimumSwaps(newInt));
       System.out.println();
    }
      
}