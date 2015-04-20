/**
 * Created by Marcel Hollink (Mjollnir94) on 28-3-2015
 * Time of creation : 10:39
 */
public class Main {

    public static void main(String[] args) {

        // Create 2 Fractions
        Fraction a = new Fraction(1,3);
        Fraction b = new Fraction(0, -4, 3);
        Fraction c = new Fraction(18, -4, 3);
        Fraction d = new Fraction(12, 9, 83);
        Fraction e = new Fraction(2, 11, 22);

        // Add fraction A to B
        System.out.println("("+ a +") + ("+ b + ") = " + Calculator.add(a,b));

        // Subtract fraction A to C
        System.out.println("("+ a +") - ("+ c + ") = " + Calculator.subtract(a,c));

        // Multiply fraction A to B
        System.out.println("("+ c +") * ("+ d + ") = " + Calculator.multiply(c,d));

        // Divide fraction A to B
        System.out.println("("+ e +") / ("+ b + ") = " + Calculator.divide(e,b));
    }
}
