public class TestRachunekBankowy {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000.0);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0);

        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();

        System.out.println("Zmiana stopy procentowej: ");

        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();


        //System.out.println(saver1.getSaldo());
        //System.out.println(saver2.getSaldo());



    }
}
