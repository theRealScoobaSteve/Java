import java.util.Scanner;
public class PentagonArea {
    public static Scanner input;
    public static Pentagon pentagon;
    public static double radial;
    public static boolean toBreak = false;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex of pentagons (-1 to quit): ");
        do {
            if(input.hasNextDouble()) {
                radial = input.nextDouble();
                if (radial != -1) //|| input.hasNextDouble())
                {
                    pentagon = new Pentagon(radial);
                    System.out.printf("The area of the pentagon with vertex length %,.2f is %,.2f\n"
                            , radial, pentagon.GetArea());
                } else {
                    toBreak = true;
                }
            }else
                toBreak = true;
            if(toBreak)
                break;
        }while (true);
    }
}
class Pentagon{
    private double side;
    private double area;

    Pentagon(double r)
    {
        side = (2*r*Math.sin(Math.PI/5));
    }
    void CalcArea()
    {
        area = (Math.pow(side,2)*5)/(4*Math.tan(Math.PI/5));
    }
    public double GetArea()
    {
        CalcArea();
        return area;
    }
}