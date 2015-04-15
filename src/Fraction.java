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
    public Fraction(int wholes, int numerator, int denominator) {
        this.numerator = numerator + (denominator*wholes);
        this.denominator = denominator;

        if(numerator > denominator) {
            this.wholes = (numerator-(numerator%denominator))/denominator;
        }

        int x = numerator;
        while (x > 0) {

            if (numerator % x == 0 && denominator % x == 0) {
                this.numerator = numerator / x;
                this.denominator = denominator / x;
                break;
            }
            x--;
        }
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        wholes = 0;
        if(numerator > denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;
        }

        int x = numerator;
        while (x > 0) {

            if (numerator % x == 0 && denominator % x == 0) {
                this.numerator = numerator / x;
                this.denominator = denominator / x;
                break;
            }
            x--;
        }


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

        // IF WHOLES
        if(numerator > denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;

            return wholes + " and " + (this.getNumerator()-(this.getDenominator()*wholes)) + "/" + this.getDenominator();
        }
        // ELSE
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
