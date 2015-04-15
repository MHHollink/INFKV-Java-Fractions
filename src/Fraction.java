/**
 * This Class was created by marcel on 28-3-2015
 * Time of creation : 10:40
 */
public class Fraction {

    private int numerator;
    private int denominator;
    private int wholes;

    /**
     * Constuctor of the fraction, sets the values of the fraction, then tries to simplify if possible.
     * @param numerator top of the fraction
     * @param denominator bottom of the fraction
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        int x = numerator;
        while (x > 0) {

            if (numerator % x == 0 && denominator % x == 0) {
                this.numerator = numerator / x;
                this.denominator = denominator / x;
                break;
            }
            x--;
        }

        wholes = 0;
        if(numerator > denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;
        }
    }

    /**
     * divides the fraction by another given fraction.
     *
     * @param f Fraction to devide by.
     * @return new fraction after division
     */
    public Fraction divedeBy(Fraction f) {
        return simplify(
                new Fraction(
                        numerator * f.getDenominator(),
                        denominator * f.getNumerator()));
    }

    /**
     * multiplies the fraction bu another given fraction
     *
     * @param f Fraction to multiply by.
     * @return new fraction after the multiplication
     */
    public Fraction multiplyBy(Fraction f) {
        return simplify(
                new Fraction(
                        numerator * f.getNumerator(),
                        denominator * f.getDenominator()));
    }

    /**
     *
     * @param f Fraction to subtract with.
     * @return new fraction after subtraction
     */
    public Fraction minus(Fraction f) {
        return simplify(new Fraction(
                numerator * f.getDenominator() - denominator * f.getNumerator(),
                denominator * f.getDenominator()));
    }

    /**
     *
     * @param f Fraction to add on.
     * @return new fraction after the addition
     */
    public Fraction plus(Fraction f) {
        return simplify(
                new Fraction(
                        numerator * f.getDenominator() + denominator * f.getNumerator(),
                        denominator * f.getDenominator()));
    }

    /**
     *
     * @param f fraction after calculation from multiplication, division, addition or subtraction
     * @return The smallest possible fraction
     */
    private Fraction simplify(Fraction f) {
        int x = f.getNumerator();

        while (x > 0) {

            if (f.getNumerator() % x == 0 && f.getDenominator() % x == 0) {
                return new Fraction(f.getNumerator() / x, f.getDenominator() / x);
            }
            x--;
        }
        return f;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getWholes(){

        if(numerator > denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;
        }

        return wholes;
    }

    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
