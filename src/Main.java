/**
 * Created by Marcel Hollink (Mjollnir94) on 28-3-2015
 * Time of creation : 10:39
 */
public class Main {

    public static void main(String[] args) {

        // Create 2 Fractions
        Fraction a = new Fraction(1,5);
        Fraction b = new Fraction(2,15);

        // Add fraction A to B
        System.out.println(Calculator.add(a,b));

        // Subtract fraction A to B
        System.out.println(Calculator.subtract(a,b));

        // Multiply fraction A to B
        System.out.println(Calculator.multiply(a,b));

        // Divide fraction A to B
        System.out.println(Calculator.divide(a,b));

    }
}
