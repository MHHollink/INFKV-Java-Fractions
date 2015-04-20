/**
 * Created by Marcel Hollink (Mjollnir94) on 28-3-2015
 * Time of creation : 10:39
 */
public class Calculator {

    /**
     * Divides fraction A by fraction B.
     *
     * @param a Fraction a, the fraction above the ditch
     * @param b Fraction b, the fraction below the ditch
     * @return simplified Fraction as result of the division.
     */
    public static Fraction divide(Fraction a, Fraction b) {
        return simplify(
                new Fraction(
                        a.getNumerator() * b.getDenominator(),
                        a.getDenominator() * b.getNumerator()));
    }

    /**
     * Multiplies fraction A by fraction B.
     *
     * @param a Fraction a
     * @param b Fraction b
     * @return simplified Fraction as result of the multiplication.
     */
    public static Fraction multiply(Fraction a, Fraction b) {
        return simplify(
                new Fraction(
                        a.getNumerator() * b.getNumerator(),
                        a.getDenominator() * b.getDenominator()));
    }

    /**
     * Subtracts fraction A by fraction B.
     *
     * @param a Fraction a, the fraction in front of the minus
     * @param b Fraction b, the fraction after the minus
     * @return simplified Fraction as result of the subtraction.
     */
    public static Fraction subtract(Fraction a, Fraction b) {
        return simplify(new Fraction(
                a.getNumerator() * b.getDenominator() - a.getDenominator() * b.getNumerator(),
                a.getDenominator() * b.getDenominator()));
    }

    /**
     * Adds fraction A by fraction B.
     *
     * @param a Fraction a
     * @param b Fraction b
     * @return simplified Fraction as result of the summation.
     */
    public static Fraction add(Fraction a, Fraction b) {
        return simplify(
                new Fraction(
                        a.getNumerator() * b.getDenominator() + a.getDenominator() * b.getNumerator(),
                        a.getDenominator() * b.getDenominator()));
    }

    /**
     * Simplifies Fraction A to the smallest possible Fraction.
     *
     * @param a fraction after calculation from multiplication, division, summation or subtraction
     * @return The smallest possible fraction
     */
    public static Fraction simplify(Fraction a) {

        int x;
        if( a.getNumerator() > 0){
            x = a.getNumerator();
        } else {
            x = Math.abs(a.getNumerator());
        }

        while (x > 0) {

            if(Math.abs(a.getNumerator()) % x == 0
                    && a.getDenominator() % x == 0)
            {
                return new Fraction(a.getNumerator() / x, a.getDenominator() / x);
            }


            if (a.getNumerator() % x == 0 && a.getDenominator() % x == 0) {
                return new Fraction(a.getNumerator() / x, a.getDenominator() / x);
            }
            x--;
        }
        return a;
    }
}
