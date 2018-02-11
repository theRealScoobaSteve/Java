/*
    @author - Stephen Simone

    @input - a number in miliseconds
    @output - what that date of that amount of milliseconds is
 */

import java.util.Date;
import java.util.Scanner;

public class MyTime {
    public static void main(String[] args){

        // Takes in the milliseconds
        Scanner in = new Scanner(System.in);
        long value = in.nextLong();

        // Creates the data from said input
        Date date = new Date(value);
        System.out.println(date);
    }
}
