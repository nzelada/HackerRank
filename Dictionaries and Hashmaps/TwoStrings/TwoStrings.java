import java.io.*;

import java.util.*;


public class TwoStrings {

   
    static String twoStrings(String s1, String s2) {
        String answer = "NO"; //default string
for (char s : s1.toCharArray()){ // for loop of s1 turned into char array
    if(s2.indexOf(s) >=0){ // if one of the indexes of s2 is the same as s1
        answer = "YES";
        return answer; // then return yes
    }
}
    return answer; // if not return no
}




    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String word1;
        String word2;
        System.out.println("Enter the first word you wish to see if they have a common substring:\n");
        word1 = scanner.nextLine();
        System.out.println("Enter the second word:\n");
        word2 = scanner.nextLine();
        System.out.println("The words were " + word1 + " and " + word2);

       
        System.out.println("Does the word contain any same substring: " + twoStrings(word1,word2));

    }
}
