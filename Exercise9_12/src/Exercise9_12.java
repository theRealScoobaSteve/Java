import java.util.Scanner;
import java.util.Arrays;

public class Exercise9_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle: ");
        String input= sc.nextLine();
        String[] data = input.split(" ");

        while( sc.hasNext() ) {
            int length = data.length;

            if( length == 3 ) {
                double sLength = Double.parseDouble( data[3] );
                sLength *= 2;
                rect myRect = new rect( sLength, sLength );
                System.out.printf( "perimeter: %.2f" + "\n", myRect.getPerimeter() );
                System.out.printf( "area: %.2f" + "\n", myRect.getArea() );
            }
            else {
                rect rect1 = new rect( Double.parseDouble( data[0] ), Double.parseDouble( data[1] ),
                                        Double.parseDouble( data[2] ), Double.parseDouble( data[3] ) );
                if( rect1.( data ) ) {
                    System.out.println( "contains: true" );
                }
                else {
                    System.out.println( "contains: false" );
                }

                if( overlaps( data ) ) {
                    System.out.println( "overlaps: true" );
                }
                else {
                    System.out.println( "overlaps: false" );
                }
            }

            System.out.println("Enter rectangle: ");
            input = sc.nextLine();
            data = input.split(" ");
        }
    }
}

class rect {
    private double x,y,w,h;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    rect( double w, double h ) {
        this.w = w;
        this.h = h;
        this.x = 0;
        this.y = 0;
    }

    rect(double a, double b, double c, double d ) {
        x=a; y=b; w=c; h=d;
    }

    public double getPerimeter() {
        return w * ( w + h );
    }

    public double getArea() {
        return w * h;
    }

    public boolean contains( double x, double y ) {
        return Math.abs( x - this.x ) <= w / 2 &&
                Math.abs( y - this.y ) <= h /2;
    }

    public boolean contains( rect r ) {
        return contains( r.getX() - r.getW() / 2, r.getY() - r.getH() / 2 ) &&
                contains( r.getX() + r.getW() / 2, r.getY() + r.getH() / 2 ) &&
                contains( r.getX() + r.getW() / 2, r.getY() - r.getH() /2 );
    }

    public boolean overlaps( rect r ) {
        return ( Math.abs( r.getX() - this.x ) <= ( r.getW() + this.w ) / 2 &&
                 Math.abs( r.getY() - this.y ) <= ( r.getH() + this.h / 2) );
    }
}
