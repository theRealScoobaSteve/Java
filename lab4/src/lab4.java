import java.util.Arrays;

public class lab4 {
    public static int binarySearch(
        int[] sortedArray, int key, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low)
            return -1;

        if (key == sortedArray[middle]) {
            return middle;
        }
        else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, low, middle - 1);
        }
        else {
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }

    public static int linearSearch(int[] sortedArray, int key) {
        int length = sortedArray.length;

        for( int i = 0; i < length; ++i ) {
            if(sortedArray[i] == key)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        long[][] myTimes = new long[3][1];
        int data[] = new int[100000];
        int length = data.length;
        int key = 788;
        for( int i = 0; i < length; ++i ) {
            data[i] = i;
        }
        myTimes[0][0] = System.nanoTime();
        int index = linearSearch( data, key );
        myTimes[0][0] = System.nanoTime() - myTimes[0][0];

        myTimes[1][0] = System.nanoTime();
        index = binarySearch( data, key,0, length );
        myTimes[1][0] = System.nanoTime() - myTimes[1][0];

        myTimes[2][0] = System.nanoTime();
        Arrays.binarySearch( data, key );
        myTimes[2][0] = System.nanoTime() - myTimes[2][0];

        for( int i = 0; i < 3; ++i ) {
            System.out.println("Time is: " + myTimes[i][0]);
        }

    }
}
