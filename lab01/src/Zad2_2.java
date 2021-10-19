import java.util.Scanner;
//import static java.lang.Math.*;
public class Zad2_2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = scan.nextInt();
        int wynik = 0;
        for(int i=0; i < n; i++)
        {
            int a = scan.nextInt();
            if(a<0)
                a = 0;
            else
                a = 2*a;

            wynik = wynik + a;
        }
        System.out.println(wynik);
    }

}
