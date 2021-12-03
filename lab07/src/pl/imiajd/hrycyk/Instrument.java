package pl.imiajd.hrycyk;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return this.producent;
    }

    public LocalDate getRokProdukcji() {
        return this.rokProdukcji;
    }

    public abstract String dzwiek();

    @Override
    public String toString() {
        return "Instrument producent: " +
                this.producent + " wyprodukowany w : " + this.rokProdukcji;
    }

    @Override
    public boolean equals(Object o) {
        return this.toString().equals(o.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(producent, rokProdukcji);
    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Instrument that = (Instrument) o;
//        return Objects.equals(producent, that.producent) && Objects.equals(rokProdukcji, that.rokProdukcji);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(producent, rokProdukcji);
//    }
}
