package pl.imiajd.hrycyk;

public class Test {
    public static void main(String[] args) {
        Adres ad1 = new Adres("Zamenhofa", "13", "10","Olsztyn","10-280");
        Adres ad11 = new Adres("Zamenhofa", "13","Olsztyn","10-280");
        Adres ad2 = new Adres("Zamenhofa", "13", "10","Olsztyn","10-279");
        Adres ad3 = new Adres("Zamenhofa", "13", "10","Olsztyn","10-281");


        ad1.pokaz();
        ad11.pokaz();
        ad2.pokaz();
        ad3.pokaz();

        System.out.println(ad2.przed(ad1));
        System.out.println(ad1.przed(ad3));
        System.out.println(ad3.przed(ad2));
        System.out.println(ad3.przed(ad11));

        Osoba Joanna = new Osoba("Plich",1999);
        Student Damian = new Student("Tycha",1998,"budownictwo");
        Nauczyciel Adam = new Nauczyciel("Szybka",1978,3560);

        System.out.println("\n");
        System.out.println(Joanna);
        System.out.println("Następny: ");
        System.out.println(Damian);
        System.out.println("Następny: ");
        System.out.println(Adam);

        System.out.println("Opis Damiana: ");
        System.out.println(Damian.getKierunek());
        System.out.println(Damian.getNazwisko());
        System.out.println(Damian.getRokUrodzenia());

        System.out.println("Pensja Adama: ");
        System.out.println(Adam.getPensja());

        System.out.println("Prostokąt: ");
        BetterRectangle prostokat= new BetterRectangle(1, 1, 4, 3);
        System.out.println("Pole: " + prostokat.getArea());
        System.out.println("Obwód: " + prostokat.getPerimeter());
        BetterRectangle figProstokat= new BetterRectangle(1, 4, 2, 2);
        System.out.println("Pole: " + figProstokat.getArea());
        System.out.println("Obwod: " + figProstokat.getPerimeter());
    }
}
