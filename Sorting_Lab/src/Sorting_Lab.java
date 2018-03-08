import java.util.Random;

public class Sorting_Lab {
    public static void selectionSort(int[] x) {
        // Cycle through
        for (int i=0; i<x.length-1; i++) {
            for (int j=i+1; j<x.length; j++) {
                if (x[i] > x[j]) {
                    //... Exchange elements
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort( int[] numArray ) {
        int n = numArray.length;
        int temp = 0;
        for ( int i = 0; i < n; ++i ) {
            for ( int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
    }

    public static void insertionSort( int[] input ){
        int temp;
        for ( int i = 1; i < input.length; ++i ) {
            for( int j = i ; j > 0 ; --j ){
                if( input[j] < input[j-1] ){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
    }

    public static int[] create() {
        Random rand = new Random();
        int test[] = new int[10000];
        for( int i = 0; i < 10000; ++i ){
            int  n = rand.nextInt(10000 ) + 1;
            test[i] = n;
        }

        return test;
    }

    public static void main( String[] args ) {
        double totalRuntime = 0;
        int[] data = create();
        // Get an average to better asses times
        for ( int i = 0 ; i < 1000 ; ++i ){
            long startTime = System.currentTimeMillis();
            selectionSort( data );
            long endTime = System.currentTimeMillis();
            totalRuntime += (endTime - startTime);
        }

        System.out.println("Algorithm slectionSort on average took "
                + totalRuntime/100 + " milliseconds");

        for ( int i = 0 ; i < 1000 ; ++i ){
            long startTime = System.currentTimeMillis();
            bubbleSort( data );
            long endTime = System.currentTimeMillis();
            totalRuntime += (endTime - startTime);
        }

        System.out.println("Algorithm bubbleSort on average took "
                + totalRuntime/100 + " milliseconds");

        for ( int i = 0 ; i < 1000 ; ++i ){
            long startTime = System.currentTimeMillis();
            insertionSort( data );
            long endTime = System.currentTimeMillis();
            totalRuntime += (endTime - startTime);
        }

        System.out.println("Algorithm insertionSort on average took "
                + totalRuntime/100 + " milliseconds");
    }
}
