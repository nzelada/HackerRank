import java.io.*;
import java.util.*;


public class Solution {

    // Complete the minimumSwaps function below.
      static int minimumSwaps(int[] array) {
        int minSwaps = 0; // Start at 0
        for (int i = 0; i < array.length - 1; i++) { // run loop until one less of size of array
            if (i < array[i] - 1) { // if i is less than the number - 1 then
                swap(array, i, Math.min(array.length - 1, array[i] - 1)); // call for swap, the array, i, smallest # 
                minSwaps++; // count
                i--; // decrease
            }
        }
        return minSwaps; // return it
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i]; // swap 
        array[i] = array[j]; // swap  
        array[j] = temp; // swap 
    }


    public static void main(String[] args) throws IOException {
       int[] newInt = new int[] {1,3,5,2,4,6,7};
      
       System.out.println("\nThe number of swaps are: "+minimumSwaps(newInt)+"\n"); // call and print
     
    }
      
}