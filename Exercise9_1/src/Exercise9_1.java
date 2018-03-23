import java.util.Scanner;

public class Exercise9_1 {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        long data = in.nextLong();
        time myTime = new time( data );
        System.out.print( "Enter milliseconds: ");
        System.out.println( myTime.getHours() + " " + myTime.getMinutes() + " " + myTime.getSeconds() );
    }
}

class time {
    private long mili;

    public time( long mili ) {
        this.mili = mili;
    }

    public String getSeconds() {
        int seconds = (int) ( mili / 1000 ) % 60 ;
        String secs = String.valueOf( seconds );
        return secs;
    }

    public String getMinutes() {
        int minutes = (int) (( mili / (1000*60 )) % 60);
        String mins = String.valueOf( minutes );
        return mins;
    }

    public String getHours() {
        int hours  = (int) (( mili / (1000*60*60 )) % 24);
        String hrs = String.valueOf( hours );
        return hrs;
    }
}
