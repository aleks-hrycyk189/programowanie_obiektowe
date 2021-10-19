import java.util.Scanner;
//import static java.lang.Math.*;
public class Zad1_2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = scan.nextInt();
        Integer [] tab = new Integer[n];

        Scanner odczyt = new Scanner(System.in);
        //pobranie danych
        for(int i=0; i<n; i++)
            tab[i] = odczyt.nextInt();
        int pom = tab[0];
        for(int i=0; i<n-1; i++)
        {
            tab[i] = tab[i+1];
        }
        tab[n-1] = pom;
        //wyświetlenie
        for(int i=0; i<n; i++)
            System.out.println(tab[i]);
    }
}
