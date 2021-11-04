import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zad5 {
    public static String kapital(float p, float k, int n) {
        BigDecimal procent = new BigDecimal(String.valueOf(p));
        BigDecimal kapital = new BigDecimal(String.valueOf(k));
        BigDecimal dev = new BigDecimal(100);
        BigDecimal wynik = new BigDecimal(String.valueOf(0));
        wynik =  wynik.add(kapital.multiply(BigDecimal.ONE.add(procent.divide(dev)).pow(n)));
        wynik = wynik.setScale(2, RoundingMode.HALF_UP);

        return wynik.toString();
    }

}

