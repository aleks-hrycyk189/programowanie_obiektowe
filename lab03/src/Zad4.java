import java.math.BigInteger;

public class Zad4 {
    public static void szachy(int n) {
        BigInteger ziarenka = new BigInteger("1");
        BigInteger wynik = new BigInteger("1");
        BigInteger mnoz = new BigInteger("2");

        for(int i = 0; i < n * n-1; i++)
        {
            ziarenka = ziarenka.multiply(mnoz);
            wynik = wynik.add(ziarenka);
        }
        System.out.println(wynik.toString());

    }
}
