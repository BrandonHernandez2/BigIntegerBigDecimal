import java.math.BigDecimal;
import java.math.BigInteger;


public class Main {

    public static void main(String[] args) {
        //Big Integer
        BigInteger number = new BigInteger("36554651465432168765196874654168765132165765321654654654321324");
        BigInteger number2 = new BigInteger("654635419668765496876543541657654765416876476354168765465796546546876546576547654657657432135468798765465");

        System.out.println("number 1 is " + number);
        System.out.println("number 2 is " + number2);
        System.out.println("Their GCD is " + number.gcd(number2));

        System.out.println();

        //Big Decimal
        BigDecimal decimal = new BigDecimal(.123534265363734588654944562463734856854674213662652313125456);
        BigDecimal decimal2 = new BigDecimal(.56702347657382474577987324364528824532523567865023498766123);

        System.out.println("decimal 1 is " + decimal);
        System.out.println("decimal 2 is " + decimal2);

        System.out.println("decimal 1 squared is " + decimal.pow(2));
        System.out.println("decimal 2 squared is " + decimal2.pow(2));
    }

}