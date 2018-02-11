import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integers, input ends with 0: ");
        String input = in.nextLine();
        String values[] = input.split("\\s");

        if( values[0].equals("0") ) {
            System.out.print("No numbers were entered except 0\n");
        }
        else {
            int length = values.length;
            int posCount = 0;
            int negCount = 0;
            int total = 0;
            int totalCount = 0;
            for( int i = 0; i < length; ++i) {
                int value = Integer.parseInt( values[i] );
                total += value;

                if( value < 0)
                    negCount++;
                else
                    posCount++;

                totalCount++;
            }

            System.out.println(total);
            System.out.println(totalCount);
            double average = (double)(total / totalCount);
            System.out.println(average);
            System.out.println("The number of positives is " + posCount);
            System.out.println("The number of negatives is " + negCount);
            System.out.println("The total count is " + totalCount);
            System.out.println("The average is " + average);
        }
    }
}
