import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = in.nextInt();
        System.out.print("Is " + input + " an even number? ");
        if(input % 2 == 0)
            System.out.print("true\n");
        else
            System.out.print("false\n");
    }
}
