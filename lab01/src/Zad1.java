import java.util.Scanner;
//import static java.lang.Math.*;

public class Zad1 {
    public static void main (String[] args) {
        //zad.1a
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        int wynik = 0;
//        for(int i=0; i < n; i++)
//        {
//            int a = scan.nextInt();
//            wynik = wynik + a;
//        }
//        System.out.println(wynik);

        //zad.1b
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        int wynik = 1;
//        for(int i=0; i < n; i++)
//        {
//            int a = scan.nextInt();
//            wynik = wynik * a;
//        }
//
//        System.out.println(wynik);


        //zad.1c
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        int wynik = 0;
//        for(int i=0; i < n; i++)
//        {
//            int a = scan.nextInt();
//            a = Math.abs(a);
//            wynik = wynik + a;
//        }
//
//        System.out.println(wynik);

        //zad.1d

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        double wynik = 0;
//        for(int i=0; i < n; i++)
//        {
//            double a = scan.nextDouble();
//            wynik = wynik + Math.sqrt(Math.abs(a));
//        }
//        System.out.println(wynik);

        //zad.1e
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        int wynik = 1;
//        for(int i=0; i < n; i++)
//        {
//            int a = scan.nextInt();
//            wynik = wynik * Math.abs(a);
//        }
//
//        System.out.println(wynik);

        //zad.1f
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        double wynik = 0;
//        for(int i=0; i < n; i++)
//        {
//            double a = scan.nextDouble();
//            a = Math.pow(a,2);
//            wynik = wynik + a;
//        }
//
//        System.out.println(wynik);

        //zad.1g

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        int n = scan.nextInt();
//        int wynik = 0;
//        int wynik2 = 1;
//        for(int i=0; i < n; i++)
//        {
//            int a = scan.nextInt();
//            wynik = wynik + a;
//            wynik2 = wynik2 * a;
//        }
//        System.out.println(wynik);
//        System.out.println(wynik2);

        //zad.1h
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbe n: ");
//        double n = scan.nextDouble();
//        double wynik = 0;
//        for(int i=1; i <= n; i++)
//        {
//            double a = scan.nextDouble();
//            double b = Math.pow(-1,i+1);
//            wynik = wynik + (a * b);
//        }
//        System.out.println(wynik);

        //zad.1g
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        double n = scan.nextDouble();
        double wynik = 0;
        double wyniks = 1;
        for(int i=1; i <= n; i++)
        {
            wyniks = wyniks * i;
            double a = scan.nextDouble();
            double b = Math.pow(-1,i);
            wynik = wynik + ((a * b)/wyniks);
        }
        System.out.println(wynik);
    }
}