import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CountInteger {
    static Scanner input = new Scanner(System.in);
    static int positive, negative;
    static int total;

    public static void main(String[] args) {
        System.out.print("Enter integers, input ends with 0: ");
        int index = 0;
        do {
            int here = input.nextInt();
            if (here != 0) {
                total += here;
                index++;
                if (here < 0) {
                    negative++;
                } else {
                    positive++;
                }
            } else {
                break;
            }
        } while (true);
        if (total != 0) {
            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The total count is " + index);
            System.out.printf("The average is %.2f\n", (double) total / index);
        } else {
            System.out.println("No numbers were entered except 0");
        }
    }
}

