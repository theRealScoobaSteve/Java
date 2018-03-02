import java.util.Scanner;
public class Exercise6_11M {
    public static Scanner input;
    public static double[] intAr;
    private static final int MAX_SIZE = 10;
    static double avg = 0;
    static double sd  = 0;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        intAr = new double[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            intAr[i] = input.nextDouble();
            avg += intAr[i];
        }
        avg /= MAX_SIZE;
        for (int i = 0; i < MAX_SIZE; i++) {
            sd += Math.pow((intAr[i]-avg),2);
        }
        sd /= MAX_SIZE-1;
        double standard = Math.sqrt(sd);
        System.out.printf("The mean is %.2f\n",avg);
        System.out.printf("The standard deviation is %.2f\n",standard);

    }
}