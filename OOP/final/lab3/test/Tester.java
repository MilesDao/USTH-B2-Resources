import java.util.Arrays;

class Tester {
    public static void main(String[] args) {
        double[] a = new double[10];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            a[i] = Double.parseDouble(args[i]);

        }

        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        // mean
        // sum / 10
        System.out.println("mean : " + (double) sum / 10);
        // median
        Arrays.sort(a);
        double median = (a[4] + a[5]) / 2;
        System.out.println("median : " + median);

    }
}