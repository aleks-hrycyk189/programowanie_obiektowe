package pl.imiajd.hrycyk;

import pl.imiajd.hrycyk.Osoba;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {

    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.getNazwisko() + " " + this.getDataUrodzenia().toString() + " " +
                this.sredniaOcen;
    }

    public int compareTo(Student o) {
        if(super.compareTo(o) == 0){
            if(this.sredniaOcen < o.sredniaOcen){
                return -1;
            }
            else if(this.sredniaOcen > o.sredniaOcen){
                return 1;
            }
            return 0;
        }
        return super.compareTo(o);
    }

}
