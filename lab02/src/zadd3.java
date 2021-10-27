import java.util.Random;
import java.util.Scanner;

public class zadd3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe m z przedziału <1,10>: ");
        int m = scan.nextInt();
        if(m<1 || m>10)
            System.out.println("Podana zła liczba");

        System.out.println("Podaj liczbe n z przedziału <1,10>: ");
        int n = scan.nextInt();
        if(n<1 || n>10)
            System.out.println("Podana zła liczba");

        System.out.println("Podaj liczbe k z przedziału <1,10>: ");
        int k = scan.nextInt();
        if(k<1 || k>10)
            System.out.println("Podana zła liczba");

        int[][] ma = new int[m][n];
        generuj(ma, m, n);
        int[][] mb = new int[n][k];
        generuj(mb, n, k);
        System.out.println("Macierz a o rozmiarze: " + m + "x" + n);
        wypisywanie(ma, m, n);
        System.out.println("Macierz b o rozmiarze:" + n + "x" + k);
        wypisywanie(mb, n, k);

        int[][] c = pomnoz(ma, m, n, mb, n, k);
        System.out.println("Macierz c o rozmiarze:" + m + "x" + k);
        wypisywanie(c, m, k);

    }
    public static void generuj(int[][] tab, int a,int b) {
        Random r = new Random();
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                tab[i][j] = r.nextInt(10+9)-9;
            }
        }
    }
    public static void wypisywanie(int[][] tab, int a, int b)
    {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
            {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
            }
        System.out.println();
        }

        public static int[][] pomnoz(int[][]tab1, int a, int b, int[][]tab2, int c, int d)
        {
            int[][] wynik = new int[a][d];
            if(b == c)
            {
                for(int i = 0; i < a; i++)
                {
                    for(int j = 0; j < d; j++)
                    {
                        for(int k = 0; k < c; k++)
                        {
                            wynik[i][j] += tab1[i][k] * tab2[k][j];
                        }
                    }
                }
            }
            return wynik;
        }
    }
