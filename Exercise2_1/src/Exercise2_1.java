import java.util.Scanner;

public class Exercise2_1 {
    public static double CalcTemp(double temp){
        return ( 9.0/5)*temp + 32;
    }

    public static double Prompt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        return in.nextDouble();
    }

    public static void PrintResults(double temp) {
        System.out.printf("The temperature is %,.2f in Fahrenheit.\n", CalcTemp(temp));
    }

    public static void main(String[] args) {
        PrintResults(Prompt());
    }
}
