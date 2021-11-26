package pl.imiajd.hrycyk;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, String  numerDomu, String  numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz(){
        System.out.println(this.kodPocztowy + " " + this.miasto);
        System.out.print(this.ulica + " " + this.numerDomu);
        if(this.numerMieszkania == null)
        {
            System.out.print(" ");
        }
        else{
            System.out.print("/" + this.numerMieszkania);
        }
        System.out.println();
    }

    public boolean przed(Adres kodzik){
        int[] tab = {0,1,3,4,5};
        StringBuilder first = new StringBuilder();
        StringBuilder kod = new StringBuilder();
        for(int i : tab){
            first.append(kodzik.kodPocztowy.charAt(i));
            kod.append(this.kodPocztowy.charAt(i));
        }
        int f = Integer.parseInt(first.toString());
        int k = Integer.parseInt(kod.toString());
        return f < k;
    }
}
