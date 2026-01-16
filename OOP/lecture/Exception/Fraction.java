public class Fraction {
    private int numerator, denominator;

    public Fraction(int n, int d) throws ArithmeticException {
        if (d == 0) {
            throw new ArithmeticException();
        }
        numerator = n;
        denominator = d;
    }
}
