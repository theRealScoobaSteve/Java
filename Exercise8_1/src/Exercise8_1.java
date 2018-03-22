import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Exercise8_1 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );

        String input = in.next();
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile( regex );
        Matcher matcher = pattern.matcher( input );

        if( matcher.matches() )
            System.out.println( "valid SSN" );
        else
            System.out.println( "invalid SSN" );
    }
}
