package przykladowe_kol;
import java.time.LocalDate;
import java.time.Period;

public class Osoba {

    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        wiek = obliczWiek();
    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
        this.FutureData();
        this.obliczWiek();
    }

    private void FutureData(){
        while(this.dataUrodzenia.isAfter(LocalDate.now())){
            System.out.println("Nieprawidłowa data urodzenia! Ustawiam domyślnie 2000-01-01");
            this.setDataUrodzenia(LocalDate.of(2000,1,1));
        }
    }
    @Override
    public String toString() {
        return "Osoba "+this.imie+" "+this.nazwisko+" urodzona "+this.dataUrodzenia+", wiek "+this.wiek;
    }

    private int obliczWiek()
    {
        LocalDate data = LocalDate.now();
        wiek = Period.between(dataUrodzenia, data).getYears();
        return wiek;
    }
}

