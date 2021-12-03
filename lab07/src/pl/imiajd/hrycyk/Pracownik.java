package pl.imiajd.hrycyk;

import java.time.LocalDate;

public class Pracownik extends Osoba{

    private double pobory;
    private LocalDate dataZatrudnienia;

    public Pracownik(String nazwisko, String[] imiona, LocalDate dataUrodzenia, boolean plec, double pobory, LocalDate dataZatrudnienia) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    public String getOpis()
    {
        return String.format("pracownik zatrudniony został : %s z pensją %.2f zł", this.dataZatrudnienia.toString(), this.pobory);
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

}
