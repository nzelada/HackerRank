import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CheckMagazine {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        List<String> list = new ArrayList<>(Arrays.asList(magazine)); // Converting the array into an ArrayList
        for (String n : note) { // For loop that goes until note is over
            if (list.contains(n)) { // if anything in the note is in list
                int index = list.lastIndexOf(n); // the last index of n
                list.remove(index); // remove it from list
            } else {
                System.out.println("No"); // if the note doesnt contain in list
                return;
            }
        }
        System.out.println("Yes"); // print 
    }
    public static void main(String[] args) {
        String[] magazine = {"give", "me", "one", "grand", "today", "night"};
        String[] note = {"give", "one", "grand", "today"};

        checkMagazine(magazine, note);
        System.out.println("\n");

        String[] magazine2 = {"two", "times", "three", "is", "not", "four"};
        String[] note2 = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine2, note2);
        System.out.println("\n");

        String[] magazine3 = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
        String[] note3 = {"ive", "got", "some", "coconuts"};

        checkMagazine(magazine3, note3);
    }
}