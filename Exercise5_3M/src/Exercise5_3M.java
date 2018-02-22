import java.util.Scanner;

public class Exercise5_3M {
    public static String reverse(String arg) {
        String reverse = "";
        String string = "";
        int length = arg.length();

        if(Integer.parseInt(arg) < 0) {
            int val = Integer.parseInt(arg);
            val = val * -1;
            arg = String.valueOf(val);
            length = arg.length();
        }

        for(int i = length - 1; i >= 0; --i) {
            reverse = reverse + arg.charAt(i);
        }

        if(reverse.charAt(0) == '0') {
            for(int i = 1; i < length; ++i) {
                string = string + reverse.charAt(i);
            }
        }
        else {
            string = reverse;
        }

        return string;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int val = in.nextInt();
        val = val * 2;
        String newVal = String.valueOf(val);
        String reversed = reverse(newVal);

        System.out.print(reversed + "\n");
    }
}
