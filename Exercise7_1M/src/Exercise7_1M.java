import java.util.Scanner;

public class Exercise7_1M {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );

        Rectangle rec = new Rectangle();
        rec.setWidth( in.nextDouble() );
        rec.setLength( in.nextDouble() );

        System.out.print( rec );
    }
}

class Rectangle {
    Rectangle(){ this.width=0; this.length=0;}
    public double getLength() {
        return length;
    }

    public void setLength( double length ) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth( double width ) {
        this.width = width;
    }

    public double perimeter() {
        return ( this.length + this.width ) * 2;
    }

    public double area() {
        return this.length * this.width;
    }

    public String toString() {
        return String.format( "The area of a rectangle with width " + this.width + " and height " + this.length +
                              " is " + this.area() + "\n" + "The perimeter is " + this.perimeter() + " with interior color white\n");
    }

    private double length;
    private double width;
}
