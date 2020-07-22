import java.io.*;
import java.util.*;


public class Solution {

    // Complete the minimumSwaps function below.
      static int minimumSwaps(int[] array) {
        int minSwaps = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (i < array[i] - 1) {
                swap(array, i, Math.min(array.length - 1, array[i] - 1));
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


    public static void main(String[] args) throws IOException {
       int[] newInt = new int[] {1,3,5,2,4,6,7};
      
       System.out.println("\nThe number of swaps are: "+minimumSwaps(newInt)+"\n");
     
    }
      
}