public class Exercise4_10 {
    public static void main( String[] args) {
        int lineCount = 1;

        for( int i = 100; i < 1000; ++i ) {
            if( i % 5 == 0 && i % 6 == 0 ) {
                if( lineCount >= 10 ) {
                    System.out.print(i + "\n");
                    lineCount = 1;
                }
                else {
                    lineCount++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.print("\n");
    }
}
