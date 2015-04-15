/**
 * This Class was created by marcel on 15-4-2015
 * Time of creation : 17:49
 */
public class Main {

    public static void main(String[] args) {
        Fraction a = new Fraction(1,5);
        Fraction b = new Fraction(2,15);

        a = a.plus(b);
        System.out.println(a);

        Fraction c = new Fraction(5,3);
        System.out.println(c.getWholes());
        System.out.println(c);
    }

}
