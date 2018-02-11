/*
@author Stephen Simone

@input Take in a radius from the user
@output Print out the resulting radius calculated by the program
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Circle {

    //Calculates the area and returns the result
    public static double CalcArea(double radius){
        return Math.PI * (radius * radius);
    }

    //Prompts the user, calls the calculate area function and prints the resulting area to the console
    public static void PrintResults(){
        NumberFormat format = new DecimalFormat("#,###.00");
        double radius = Prompt();
        System.out.print("The circle with radius of " + format.format(radius) + " has area of " + format.format(CalcArea(radius)) + '\n');
    }

    //Prompts the user to enter a radius to the system
    public static double Prompt(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        return in.nextDouble();
    }

    //Calls the PrintResults method with calls all the other methods in order to create a working program
    public static void main(String[] args){
        PrintResults();
    }
}
