package pl.imiajd.hrycyk;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko,rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return this.kierunek;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKierunek: " + this.kierunek;
    }
}
