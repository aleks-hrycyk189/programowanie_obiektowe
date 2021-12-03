package pl.imiajd.hrycyk;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<>();

        orkiestra.add(new Flet("Fletive", LocalDate.of(1965,11,29)));
        orkiestra.add(new Flet("Frati", LocalDate.of(1987,3,25)));
        orkiestra.add(new Fortepian("Forte", LocalDate.of(1923,5,26)));
        orkiestra.add(new Skrzypce("Skri", LocalDate.of(1875,1,4)));
        orkiestra.add(new Skrzypce("Sfike", LocalDate.of(1963,2,25)));
        orkiestra.add(new Flet("Fletive", LocalDate.of(1965,11,29)));

        for(Instrument x: orkiestra){
            System.out.print(x.dzwiek()+ " ");
            System.out.println(x);
        }

        System.out.println(orkiestra.get(0).equals(orkiestra.get(1)));
        System.out.println(orkiestra.get(3).equals(orkiestra.get(4)));
        System.out.println(orkiestra.get(5).equals(orkiestra.get(0)));

        System.out.println(orkiestra.get(3).getProducent());
        System.out.println(orkiestra.get(3).getRokProdukcji());
    }
}
