public class Many {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {4, 3, 2, 1};
        int[] MyMany = concat(x, y);
        for (int i = 0; i < MyMany.length; i++) {
            System.out.print(MyMany[i] + " ");
        }
    }

    public static int[] concat(int[] x, int[] y) {
        int[] z = new int[x.length + y.length];
        System.arraycopy(x, 0, z, 0, x.length);
        System.arraycopy(y, 0, z, x.length, y.length);
        return z;
    }
}