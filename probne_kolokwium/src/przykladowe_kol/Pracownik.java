package przykladowe_kol;

import java.time.LocalDate;

public class Pracownik extends Osoba{
    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, LocalDate dataUrodzenia, String stanowisko, double pensja) {
        super(imie, nazwisko, dataUrodzenia);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Pracownik(Osoba osoba, String stanowisko, double pensja)
    {
        super(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzenia());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString()+" jest pracownikiem na stanowisku "+this.stanowisko+" z pensja "+String.format("%.2f", this.pensja)+"zł";
    }
}
