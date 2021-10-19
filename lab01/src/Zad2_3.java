import java.util.Scanner;
//import static java.lang.Math.*;
public class Zad2_3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n: ");
        int n = scan.nextInt();
        int liczd = 0;
        int liczu = 0;
        int liczz = 0;
        for(int i=0; i < n; i++)
        {
            int a = scan.nextInt();
            if(a > 0)
                liczd ++;
            if(a < 0)
                liczu ++;
            if(a == 0)
                liczz ++;
        }
        System.out.println(liczd);
        System.out.println(liczu);
        System.out.println(liczz);
    }

}
