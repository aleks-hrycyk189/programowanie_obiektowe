// import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class zadd1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = scan.nextInt();
        int[] tab = new int[n];


        generuj(tab,-999, 999);

        // wypisujemy elementy tablicy
        System.out.println("a: ");
        wypisz(tab);

        System.out.println(ileParzystych(tab)+"\n");
        System.out.println(ileNieparzystych(tab)+"\n");
        System.out.println(ileDodatnich(tab)+"\n");
        System.out.println(ileUjemnych(tab)+"\n");
        System.out.println(ileZerowych(tab)+"\n");
        System.out.println(ileMaksymalnych(tab)+"\n");
        System.out.println(sumaDodatnich(tab)+"\n");
        System.out.println(sumaUjemnych(tab)+"\n");
        System.out.println(dlugoscMaksymalnegoCiaguDodatnich(tab)+"\n");

        //signum(tab);
        //wypisz(tab);

        odwrocFragment(tab,1,4);
        wypisz(tab);

    }
    public static int ileParzystych(int[] tab)
    {
        int licznikp = 0;
        for(int i=0; i < tab.length; i++) {
            if (tab[i] % 2 == 0)
                licznikp++;
        }
        return licznikp;
    }
    public static int ileNieparzystych(int[] tab)
    {
        int liczniknp = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i] % 2 != 0)
                liczniknp++;
        }
        return liczniknp;
    }

    public static int ileDodatnich(int[] tab)
    {
        int licznikd = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i] > 0)
                licznikd++;
        }
        return licznikd;
    }
    public static int ileUjemnych(int[] tab)
    {
        int liczniku = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i] < 0)
                liczniku++;
        }
        return liczniku;
    }
    public static int ileZerowych(int[] tab)
    {
        int licznikz = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i] == 0)
                licznikz++;
        }
        return licznikz;
    }

    public static int sumaDodatnich(int[] tab)
    {
        int sumaD = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i] > 0)
                sumaD = sumaD + tab[i];
        }
        return sumaD;
    }

    public static int sumaUjemnych(int[] tab)
    {
        int sumaU = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i] < 0)
                sumaU = sumaU + tab[i];
        }
        return sumaU;
    }

    public static int ileMaksymalnych(int[] tab)
    {
        int max = tab[0];
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] > max)
                max = tab[i];
        }

        return max;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich (int[] tab) {
        int licz1 = 0;
        int licz2 = 0;
        for (int i = 0; i <= tab.length - 1; i++) {
            if (tab[i] > 0)
                licz1++;
            if (tab[i] < 0) {
                if (licz1 < licz2)
                    licz1 = 0;
                else {
                    licz2 = licz1;
                    licz1 = 0;
                }
            }
        }
        return licz2;
    }

    public static void signum(int[] tab)
    {
        int zastapd = 1;
        int zastapu = -1;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] >= 0)
                tab[i] = zastapd;
            else
                tab[i] = zastapu;
        }
    }

    public static void odwrocFragment(int[] tab, int lewy, int prawy)
    {
        if (prawy > tab.length)
            System.out.println("Nie mozna wczytac zawartosci, bo taka nie istnieje");
        while(lewy<prawy)
        {
            int pom= tab[lewy];
            tab[lewy] = tab[prawy];
            tab[prawy] = pom;
            lewy ++;
            prawy --;
        }
    }

    public static void generuj(int[] tab, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < tab.length; ++i) {
            tab[i] = r.nextInt(maxWartosc - minWartosc)+ minWartosc;
        }
    }
    public static void wypisz(int[] tab) {
        for (long el : tab) {
            System.out.println(el + " ");
        }
        System.out.println("");}
    }


