import java.awt.*;
import java.util.Scanner;
import java.util.Vector;

public class Exercise2_6 {
    public static String Prompt() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");

        return in.next();
    }

    public static int CalcValue(String value) {

        int length = value.length();
        int temp = 0;

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
