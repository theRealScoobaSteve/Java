import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class GP {
    public static boolean isPrime(int n) {
        int i;
        if( n == 1 )
            return false;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {
        boolean first = false;
        boolean second = false;
        Scanner in = new Scanner( System.in );
        System.out.println( "P\tisPrime\t2*P+1\tisPrime\tGermainPrime");

        while( in.hasNext() ) {
            int val = in.nextInt();
            System.out.print( val  + "\t" );

            if( isPrime( val ) ) {
                System.out.print( "true\t" );
                first = true;
            }
            else {
                System.out.print( "false\t" );
                first = false;
            }

            int newVal = val*2+1;

            System.out.print( newVal + "\t" );

            if( isPrime( newVal ) ){
                System.out.print( "true\t" );
                second = true;
            }
            else {
                System.out.print( "false\t" );
                second = false;
            }

            if( first && second ) {
                System.out.print("yes\n");
            }
            else {
                System.out.print("no\n");
            }

        }

    }
}
