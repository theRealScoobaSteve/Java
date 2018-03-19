import java.util.Scanner;

public class ProcessString {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );

        while( in.hasNext() ) {
            System.out.print( "Enter String: " );
            String data = in.next();
            System.out.print( "String " + data +" length " + data.length() + " first character " + data.charAt(0) + "\n" );
        }
    }
}
