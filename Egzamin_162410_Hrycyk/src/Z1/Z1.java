package Z1;
import java.time.LocalTime;

public class Z1 {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] tab){
        for(int i=0, j= tab.length -1; i< tab.length/2; i++, j--){
            if(tab[i].compareTo(tab[j]) != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] tabInt = new Integer[4];
        tabInt[0] = 1;
        tabInt[1] = 2;
        tabInt[2] = 2;
        tabInt[3] = 3;
        System.out.println(jestPalindromem(tabInt));

        Integer[] tabInt1 = new Integer[4];
        tabInt1[0] = 1;
        tabInt1[1] = 2;
        tabInt1[2] = 2;
        tabInt1[3] = 1;
        System.out.println(jestPalindromem(tabInt1));

        Integer[] tabInt2 = new Integer[5];
        tabInt2[0] = 1;
        tabInt2[1] = 2;
        tabInt2[2] = 4;
        tabInt2[3] = 2;
        tabInt2[4] = 1;
        System.out.println(jestPalindromem(tabInt2));

        LocalTime[] tabTime = new LocalTime[4];
        tabTime[0] = LocalTime.of(12,14);
        tabTime[1] = LocalTime.of(12,16);
        tabTime[2] = LocalTime.of(12,14);
        tabTime[3] = LocalTime.of(12,16);
        System.out.println(jestPalindromem(tabTime));

    }
}
