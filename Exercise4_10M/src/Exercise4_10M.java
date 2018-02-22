import java.util.Arrays;
import java.util.Scanner;
public class Exercise4_10M {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);


        int start = input.nextInt();
        int end = input.nextInt();
        int count = 0;
        while(start <= end)
        {
            if(start%5 == 0 && start%6 == 0)
            {
                System.out.print(start);
                count ++;
                if(count < 10){
                    System.out.print(" ");
                }else {
                    System.out.println();
                    count = 0;
                }
            }
            start++;
        }
        System.out.println();
    }
}