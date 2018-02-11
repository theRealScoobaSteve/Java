import java.awt.*;
import java.util.Scanner;
import java.util.Vector;

public class Exercise2_6M {
    public static String Prompt() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        return in.next();
    }

    public static int CalcValue(String value) {

        int length = value.length();
        int temp = 0;
        int val = Integer.parseInt(value);

        if(val < 0) {
            String newString = String.valueOf(val);
            StringBuilder myString = new StringBuilder(newString);
            myString.setCharAt(0, '0');
            length = newString.length();

            for(int i = 0; i < length; ++i)
                temp += Character.getNumericValue(myString.charAt(i));
        }
        else
            for(int i = 0; i < length; ++i)
                temp += Character.getNumericValue(value.charAt(i));

        return temp;
    }

    public static void PrintResults(String input) {
        System.out.printf("The sum of all digits in %s is %d\n", input, CalcValue(input));
    }

    public static void main(String[] args){
        PrintResults(Prompt());
    }
}
