import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Combinations {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        int vals[] = new int[2];
        boolean valid = false;
        int total = 0;

        do {
            vals[0] = in.nextInt();
            vals[1] = in.nextInt();

            if( vals[0] < vals[1] ) {
                valid = true;
            }
            else {
                System.out.print("First number must be less than second try again! ");
            }
        }while( !valid );

        int i = vals[0];
        while( i < vals[1] ) {
            for( int j = i + 1; j <= vals[1]; ++j ) {
                System.out.print(i + " " + j + "\n");
                total++;
            }
            i++;
        }

        System.out.print("The total number of combinations is " + total + '\n');

    }
}
