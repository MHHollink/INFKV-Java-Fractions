/**
 * This Class was created by marcel on 15-4-2015
 * Time of creation : 17:49
 */
public class Main {

    public static void main(String[] args) {
        Fraction a = new Fraction(1,5);
        Fraction b = new Fraction(2,15);

        System.out.println(Calculator.add(a,b));
        System.out.println(Calculator.subtract(a,b));
        System.out.println(Calculator.multiply(a,b));
        System.out.println(Calculator.divide(a,b));
    }

}
