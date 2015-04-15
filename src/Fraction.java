/**
 * Created by Marcel Hollink (Mjollnir94) on 28-3-2015
 * Time of creation : 10:39
 */
public class Fraction {

    /** Variables for an fraction **/
    private int numerator;
    private int denominator;
    private int wholes;

    /**
     *
     * @param wholes
     * @param numerator
     * @param denominator
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

    /**
     *
     * @param numerator
     * @param denominator
     */
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

    /**
     *
     * @return
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     *
     * @return
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     *
     * @return
     */
    public int getWholes(){

        if(numerator > denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;
        }

        return wholes;
    }

    @Override
    public String toString() {

        /** IF WHOLES **/
        if(numerator > denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;

            return wholes + " and " + (this.getNumerator()-(this.getDenominator()*wholes)) + "/" + this.getDenominator();
        }
        /** ELSE **/
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
