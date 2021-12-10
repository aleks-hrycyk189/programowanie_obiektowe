package pl.imiajd.hrycyk;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Student("Hrycyk", LocalDate.of(2001,7,19),4.8));
        grupa.add(new Student("Spory", LocalDate.of(2000,5,11),3.9));
        grupa.add(new Student("Matyński", LocalDate.of(1998,1,12),3.0));
        grupa.add(new Student("Hulak", LocalDate.of(1998,1,12),4.6));
        grupa.add(new Student("Spory", LocalDate.of(1993,9,22),4.0));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);

    }
}
