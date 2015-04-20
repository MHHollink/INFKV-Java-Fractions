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

        // Adding fraction
        System.out.println("adding fractions \n------");
        System.out.println("("+ a +") + ("+ a + ") = " + Calculator.add(a,a));
        System.out.println("("+ a +") + ("+ b + ") = " + Calculator.add(a,b));
        System.out.println("("+ b +") + ("+ c + ") = " + Calculator.add(b,c));
        System.out.println("("+ a +") + ("+ d + ") = " + Calculator.add(a,d));
        System.out.println("("+ c +") + ("+ e + ") = " + Calculator.add(c,e));

        System.out.println("\nsubtracting fractions \n------");
        System.out.println("("+ a +") - ("+ a + ") = " + Calculator.subtract(a,a));
        System.out.println("("+ a +") - ("+ e + ") = " + Calculator.subtract(a,e));
        System.out.println("("+ e +") - ("+ c + ") = " + Calculator.subtract(e,c));
        System.out.println("("+ b +") - ("+ d + ") = " + Calculator.subtract(b,d));
        System.out.println("("+ d +") - ("+ a + ") = " + Calculator.subtract(d,a));

        System.out.println("\nmultiplication fractions \n------");
        System.out.println("("+ c +") * ("+ d + ") = " + Calculator.multiply(c,d));
        System.out.println("("+ c +") * ("+ e + ") = " + Calculator.multiply(c,e));
        System.out.println("("+ e +") * ("+ c + ") = " + Calculator.multiply(e,c));
        System.out.println("("+ a +") * ("+ d + ") = " + Calculator.multiply(a,d));
        System.out.println("("+ a +") * ("+ a + ") = " + Calculator.multiply(a,a));

        System.out.println("\ndivision fractions \n------");
        System.out.println("("+ e +") / ("+ b + ") = " + Calculator.divide(e,b));
        System.out.println("("+ a +") / ("+ b + ") = " + Calculator.divide(a,b));
        System.out.println("("+ a +") / ("+ c + ") = " + Calculator.divide(a,c));
        System.out.println("("+ e +") / ("+ b + ") = " + Calculator.divide(e,b));
        System.out.println("("+ e +") / ("+ e + ") = " + Calculator.divide(e,e));
    }
}
