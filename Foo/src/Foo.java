import java.util.ArrayList;
import java.util.Arrays;

public class Foo {
    int i;
    static int s;

    public static void main(String[] args) {
        Double[] array = { 1,2,3 };
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(array));
        System.out.print(list);
    }
}
