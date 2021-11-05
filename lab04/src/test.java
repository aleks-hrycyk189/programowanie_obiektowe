import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,4,9,16));
        ArrayList<Integer>b = new ArrayList<>(Arrays.asList(9,7,4,9,11));

        System.out.println(a);
        System.out.println(b);

        System.out.println("Zadanie 1:");
        System.out.println(Zad1.append(a,b));

        System.out.println("Zadanie 2:");
        System.out.println(Zad2.merge(a,b));

        System.out.println("Zadanie 3:");
        System.out.println(Zad3.mergeSorted(a,b));

        System.out.println("Zadanie 4:");
        System.out.println(Zad4.reversed(a));

        System.out.println("Zadanie 5:");
        Zad5.reverse(a);
        System.out.println(a);

    }

}
