package przykladowe_kol;
import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

//        Osoba p1 = new Osoba("Kacper","Mnotek", LocalDate.of(2000,11,17));
//        System.out.println(p1);
//        Pracownik p2 = new Pracownik("Jan","Nowak", LocalDate.of(2001,10,12),"szef", 2054.24);
//        System.out.println(p2);
        ArrayList<Osoba> kolekcja = new ArrayList<>();
        Osoba o1 = new Osoba("Ola", "Hrycyk", LocalDate.of(1978,3,12));
        Osoba o2 = new Osoba("Anna", "Pik", LocalDate.of(1970,4,30));
        Osoba o3 = new Osoba("Jan", "Kowalski", LocalDate.of(1972,5,23));
        Osoba o4 = new Osoba("Jan", "Nowak", LocalDate.of(1977,12,13));
        Osoba o5 = new Osoba("Kacper", "Mnotek", LocalDate.of(1978,11,9));
        Osoba o6 = new Osoba("Joanna", "Krzaczkowska", LocalDate.of(1975,1,15));

        o1 = new Pracownik(o1, "informatyk", 9500.1234);
        o2 = new Pracownik(o2, "it manager", 10500.123);
        o3 = new Pracownik(o3, "analityk", 9500.321);

        kolekcja.add(o1);
        kolekcja.add(o2);
        kolekcja.add(o3);
        kolekcja.add(o4);
        kolekcja.add(o5);
        kolekcja.add(o6);

        for(Osoba o : kolekcja)
            System.out.println(o.toString());

        double suma = 0;
        for(Osoba o : kolekcja){
            if(o.getClass() == Pracownik.class)
                suma += ((Pracownik) o).getPensja();
        }
        System.out.println("Suma pensji pracowników: " + suma);


    }

}

