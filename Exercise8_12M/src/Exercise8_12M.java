import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_12M {
    public static boolean isAnagram(String firstWord, String secondWord) {
        String temp1 = firstWord.toLowerCase();
        String temp2 = secondWord.toLowerCase();
        char[] word1 = temp1.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = temp2.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        String val1 = in.next();
        String val2 = in.next();

        if( isAnagram( val1, val2 ) )
            System.out.println( val1 + " and " + val2 + " are an anagram" );
        else
            System.out.println( val1 + " and " + val2 + " are not an anagram" );
    }
}
