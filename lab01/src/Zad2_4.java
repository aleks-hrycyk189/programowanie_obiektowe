import java.util.Scanner;
//import static java.lang.Math.*;
public class Zad2_4 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = scan.nextInt();
        Integer [] tab = new Integer[n];
        Scanner odczyt = new Scanner(System.in);
        //pobranie danych
        for(int i=0; i<n; i++)
            tab[i] = odczyt.nextInt();
        int max = tab[0];
        int min = tab[0];
        for(int i=0; i<n; i++)
        {
            if(tab[i] > max)
                max = tab[i];
        }
        for(int i=0; i<n; i++)
        {
            if(tab[i]< min)
                min = tab[i];
        }
        System.out.println(max);
        System.out.println(min);

    }
}
