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
        if(wholes < 0 && numerator > 0){
            numerator -= numerator*2;
        }
        if(wholes > 0 && numerator < 0){
            wholes -= wholes*2;
        }

        this.numerator = numerator + (denominator*wholes);
        this.denominator = denominator;

        if(this.numerator > this.denominator) {
            this.wholes = (this.numerator-(this.numerator%this.denominator))/this.denominator;
        }

        int x = this.numerator;
        while (x > 0) {

            if (this.numerator % x == 0 && this.denominator % x == 0) {
                this.numerator = this.numerator / x;
                this.denominator = this.denominator / x;
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
        if(this.numerator > this.denominator) {
            wholes = (this.numerator-(this.numerator%this.denominator))/this.denominator;
        }

        int x = this.numerator;
        while (x > 0) {

            if (this.numerator % x == 0 && this.denominator % x == 0) {
                this.numerator = this.numerator / x;
                this.denominator = this.denominator / x;
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

        Fraction x = Calculator.simplify(this);
        this.numerator = x.getNumerator();
        this.denominator = x.getDenominator();
        this.wholes = x.getWholes();

        if(numerator == 0){
            return String.valueOf(wholes);
        }

        /** IF WHOLES **/
        if(numerator >= denominator || Math.abs(numerator) >= denominator) {
            wholes = (numerator-(numerator%denominator))/denominator;

            if(this.getNumerator()-(this.getDenominator()*wholes) == 0){
                return String.valueOf(wholes);
            }

            if(wholes == 0) {
                return (this.getNumerator()-(this.getDenominator()*wholes)) + "/" + Math.abs(this.getDenominator());
            }
            return wholes +" "+ (this.getNumerator()-(this.getDenominator()*wholes)) + "/" + Math.abs(this.getDenominator());
        }
        /** ELSE **/
        return this.getNumerator() + "/" + this.getDenominator();
    }
}
