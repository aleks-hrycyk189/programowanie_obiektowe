import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Zad2_5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = scan.nextInt();
        Integer [] tab = new Integer[n];
        Scanner odczyt = new Scanner(System.in);
        //pobranie danych
        for(int i=0; i<n; i++)
            tab[i] = odczyt.nextInt();

        List<Integer> tab1 = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            if(tab[i] > 0)
            {
                //System.out.println(tab[i]);
                tab1.add(tab[i]);
            }
        }

        for (int i = 0; i < tab1.size() - 1; i++)
            System.out.println("(" + tab1.get(i) + "," + tab1.get(i+1) + ")");






    }
}
