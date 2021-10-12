public class Zad4 {
    public static void main (String[] args) {
        double oproce = 1.06;
        double kwota = 1000;
        double wynik;
        for (int i=1; i<4; i++)
        {
            kwota= kwota * oproce;
            System.out.println("Kwota po " + i + " latach wynosi: " + kwota + "zl");
        }
        //System.out.println(wynik);
    }
}
