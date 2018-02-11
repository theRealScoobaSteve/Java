/*
@author Stephen Simone

@input Take in a radius from the user
@output Print out the resulting radius calculated by the program
 */

import java.util.Scanner;

public class Vowel {

    public static void CheckVowel(String toCheck){

        char val = toCheck.toUpperCase().charAt(0);


        if(val < 65 || val > 90)
            System.out.printf("%s is an invalid input\n", toCheck);
        else {
            switch(val){
                case 65:
                    System.out.printf("%s is a vowel\n", toCheck);
                    break;
                case 69:
                    System.out.printf("%s is a vowel\n", toCheck);
                    break;
                case 73:
                    System.out.printf("%s is a vowel\n", toCheck);
                    break;
                case 79:
                    System.out.printf("%s is a vowel\n", toCheck);
                    break;
                case 85:
                    System.out.printf("%s is a vowel\n", toCheck);
                    break;
                default:
                    System.out.printf("%s is a consonant\n", toCheck);
            }
        }
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            System.out.print("Enter a letter: ");
            CheckVowel(in.next());
        }
        System.out.print("Enter a letter: ");
    }
}
