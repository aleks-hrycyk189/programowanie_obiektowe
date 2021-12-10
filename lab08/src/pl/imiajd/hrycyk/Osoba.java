package pl.imiajd.hrycyk;

import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.nazwisko + " " + this.dataUrodzenia.toString();
    }

    @Override
    public boolean equals(Object o) {
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nazwisko, dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        int a = this.nazwisko.compareTo(o.nazwisko);
        if(a == 0)
            if(this.dataUrodzenia.equals(o.dataUrodzenia)){
                return 0;
            }
            else{
                return this.dataUrodzenia.compareTo(o.dataUrodzenia);
            }
        return a;
    }
}
