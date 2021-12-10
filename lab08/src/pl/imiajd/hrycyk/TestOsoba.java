package pl.imiajd.hrycyk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args) {


        ArrayList<Osoba> grupa = new ArrayList<>();

        grupa.add(new Osoba("Hrycyk", LocalDate.of(2001,11,4)));
        grupa.add(new Osoba("Nowak", LocalDate.of(2000,12,12)));
        grupa.add(new Osoba("Kilczkak",LocalDate.of(1996,4,6)));
        grupa.add(new Osoba("Nowak", LocalDate.of(1998,11,4)));
        grupa.add((new Osoba("Mira", LocalDate.of(1996,4,6))));


        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);



    }

}
