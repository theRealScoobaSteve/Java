import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class TelephoneMapping {
    public static char createMapping(char letter) {
        if ( letter=='A' || letter=='B' || letter== 'C' ) {
            return '2';
        }
        if( letter=='D' || letter=='E' || letter== 'F' ) {
            return '3';
        }
        if ( letter=='G' || letter=='H' || letter=='I' ) {
            return '4';
        }
        if ( letter=='J' || letter=='K' || letter=='L' ) {
            return '5';
        }
        if ( letter=='M' || letter=='N' || letter=='O' ) {
            return '6';
        }
        if ( letter=='P' || letter=='Q' || letter== 'R' || letter== 'S' ) {
            return '7';
        }
        if ( letter=='T' || letter=='U' || letter=='V' ) {
            return '8';
        }
        if ( letter=='W' || letter=='X' || letter== 'Y' || letter== 'Z' ) {
            return '9';
        }

        return letter;
    }

    public static void print( String data ) {
        String newstring = "";
        int length = data.length();
        if( length == 7 ) {
            newstring = data.substring(0, 3) + "-" + data.substring(3);
        }
        else {
            newstring = data.substring(0, 1) + "-"  + data.substring(1,4)
                    + "-" + data.substring(4,7) + "-" + data.substring(7,11);
        }
        System.out.println( newstring );
    }

    public static void main( String[] args ) {
        Scanner in = new Scanner( "1800Chargers\nChargesRuleAlways\t22cs4bRules 1800xxxTPMJ 1cimw105SQLTakeIt aAEBxyz 582CS4A\n-1" );
        String val = in.next();
        System.out.print("VAL: " + val);
        while ( val != "-1" && in.hasNext() ) {
            String caps = val.toUpperCase();
            System.out.print("VAL: " + val);
            int length = val.length();
            if( length > 11 ) {
                length = 11;
            }
            String print = "";
            for ( int i = 0; i < length; ++i ) {
                print += createMapping( caps.charAt(i) );
            }
            print( print );
            val = in.next();
        }

    }
}
