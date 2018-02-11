import java.util.Scanner;

public class Exercise3_1 {

    public static void checkTriangle(double x, double y, double z) {

        System.out.print("Can edges " + x + ", " + y + ", and " + z + " form a triangle? ");

        if(x >= y && x >= z) {
            if (z + y > x)
                System.out.print("true\n");
            else
                System.out.print("false\n");
        }
        else if(y >= z && y >= x) {
            if (z + x > y)
                System.out.print("true\n");
            else
                System.out.print("false\n");
        }
        else if(z >= x && z >= y) {
            if (y + x > z)
                System.out.print("true\n");
            else
                System.out.print("false\n");
        }
        else
            System.out.print("false\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three edges: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();

        checkTriangle(x, y, z);
    }
}
