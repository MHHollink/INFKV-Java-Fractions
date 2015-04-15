/**
 * This Class was created by marcel on 15-4-2015
 * Time of creation : 18:07
 */
public class Calculator {

    /**
     * divides the fraction by another given fraction.
     *
     * @param a Fraction to devide by.
     * @return new fraction after division
     */
    public static Fraction divide(Fraction a, Fraction b) {
        return simplify(
                new Fraction(
                        a.getNumerator() * b.getDenominator(),
                        a.getDenominator() * b.getNumerator()));
    }

    /**
     * multiplies the fraction bu another given fraction
     *
     * @param a Fraction to multiply by.
     * @return new fraction after the multiplication
     */
    public static Fraction multiply(Fraction a, Fraction b) {
        return simplify(
                new Fraction(
                        a.getNumerator() * b.getNumerator(),
                        a.getDenominator() * b.getDenominator()));
    }

    /**
     *
     * @param a Fraction to subtract with.
     * @return new fraction after subtraction
     */
    public static Fraction subtract(Fraction a, Fraction b) {
        return simplify(new Fraction(
                a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator(),
                a.getDenominator() * b.getDenominator()));
    }

    /**
     *
     * @param a Fraction to add on.
     * @return new fraction after the addition
     */
    public static Fraction add(Fraction a, Fraction b) {
        return simplify(
                new Fraction(
                        a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(),
                        a.getDenominator() * b.getDenominator()));
    }

    /**
     *
     * @param a fraction after calculation from multiplication, division, addition or subtraction
     * @return The smallest possible fraction
     */
    private static Fraction simplify(Fraction a) {
        int x = a.getNumerator();

        while (x > 0) {

            if (a.getNumerator() % x == 0 && a.getDenominator() % x == 0) {
                return new Fraction(a.getNumerator() / x, a.getDenominator() / x);
            }
            x--;
        }
        return a;
    }
}
