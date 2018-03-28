public class test {
    public static void main(String[] args) {
        int[] x = {0, 1, 2, 3, 4, 5};
        xMethod(x, 5);
    }

    public static void xMethod(int[] x, int length) {
        for (int i = 0; i < length; i++)
            System.out.print(" " + x[i]);
    }
}
