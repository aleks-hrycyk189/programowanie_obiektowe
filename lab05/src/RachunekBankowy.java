public class RachunekBankowy {
    private static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldoNew) {
        this.saldo = saldoNew;
    }

    public void obliczMiesieczneOdsetki(){
        this.saldo += (this.saldo* rocznaStopaProcentowa) / 12;
        System.out.println(this.saldo);
    }
    public static void setRocznaStopaProcentowa(double stopaNew){
        rocznaStopaProcentowa = stopaNew;
    }
//    public double getSaldo() {
//        return this.saldo;}
    }


