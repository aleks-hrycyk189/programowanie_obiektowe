package pl.imiajd.hrycyk;

import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"}, LocalDate.of(1996,12,3), false, 4965, LocalDate.of(2012, 4,1));
        ludzie[1] = new Student("Nowak", new String[]{"Małgorzata", "Maria"}, LocalDate.of(1998,4,12), true, "Informatyka", 4.85 );


        for (Osoba p : ludzie) {
            for (String x: p.getImiona()){
                System.out.print(x + " ");
            }
            String plec1;
            if (p.isPlec()) {
                plec1 = "kobieta";
            }else{
                plec1 = "mężczyzna";
            }
            System.out.println(p.getNazwisko() + ": " + p.getOpis() + " urodzony: " + p.getDataUrodzenia() + ", płeć: " + plec1 + ".");
        }
    }
}

