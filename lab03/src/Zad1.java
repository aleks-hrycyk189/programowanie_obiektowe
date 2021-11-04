import java.util.Scanner;

public class Zad1 {
    public static int countChar(String str, char c)
    {
        int len = str.length();
        int licznik = 0;
        for(int i=0; i < len; i++) {
            if (str.charAt(i) == c || str.charAt(i) == Character.toUpperCase(c))
                licznik++;
        }
        return licznik;
    }

    public static int countSubStr(String str, String subStr) {
        int dl1 = str.length();
        int dl2 = subStr.length();

        if (dl1 == 0 || dl2 == 0 || dl2 > dl1)
            return 0;

        int index = 0;
        int licznik = 0;

        for (int i = 0; i < dl1; i++) {
            if (index + dl2 <= dl1) {
                if (str.substring(index, index + dl2).equals(subStr)) {
                    licznik++;
                }
                index++;
            }
        }
        return licznik;
    }


    public static String middle2(String str)
    {
        int len = str.length();
            if(len % 2 == 0) {
                return str.substring((str.length()/2)-1, str.length()/2 +1);
            }
            if(len % 2 == 1){
                //double len1 = (str.length()/2);
                return str.substring((int)str.length()/2, (int)str.length()/2 +1);
        }
            return " ";
    }

    public static String repeat(String str, int n)
    {
        String news ="";
        for(int i=0; i<n; i++)
            news = news.concat(str);
        return news;
    }

    public static int[] where(String str, String subStr) {
        int[] tab = new int[countSubStr(str, subStr)];
        int n = 0;
        int dl1 = str.length();
        int dl2 = subStr.length();

        if (dl1 == 0 || dl2 == 0 || dl2 > dl1) {
            return tab;
        }

        int index = 0;
        String temp;

        for (int i = 0; i < dl1; i++) {
            if (index + dl2 <= dl1) {
                temp = str.substring(index, index + dl2);
                if (temp.equals(subStr)) {
                    tab[n] = i;
                    n++;
                }
                index++;
            }
        }
        return tab;
    }

    public static String change(String str) {
        StringBuffer zmiana = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase((str.charAt(i)))) {
                zmiana.append(String.valueOf(str.charAt(i)).toLowerCase());
            } else zmiana.append(String.valueOf(str.charAt(i)).toUpperCase());
        }
        return zmiana.toString();
    }

    public static String nice(String str){
        StringBuffer liczby = new StringBuffer();
        int z = 1;
        for(int i=(str.length()-1); i >= 0; i--){
            liczby.append(str.charAt(i));
            if(z % 3 == 0 && i != 0)  liczby.append("'");
            z++;
        }
        String temp = liczby.toString();
        liczby = new StringBuffer();
        for(int i=temp.length() -1; i >= 0; i--){
            liczby.append(temp.charAt(i));
        }
        return liczby.toString();
    }

    public static String nice (String str, char c, int n){
        StringBuffer zmiana = new StringBuffer();
        int index = 0;
        for (int i = 0; i < str.length(); i++){
            zmiana.append(str.charAt(i));
            index++;
            if(index % n == str.length() % n && i != str.length() -1){
                zmiana.append(c);
            }
        }
        return zmiana.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj napis: ");
        String str = scan.nextLine();
        System.out.println("Podaj liczbe: ");
        int n = scan.nextInt();
        System.out.println("Podaj znak do zliczenia: ");
        char c = scan.next().charAt(0);
//        System.out.println("Podaj napis do wyszukania: ");
//        String subStr = scan.nextLine();
//        System.out.println(countSubStr(str, subStr));
//        System.out.println(where(str, subStr));
//        System.out.println(change(str));
        System.out.println(nice(str));

//        System.out.println(middle2(str));
//        System.out.println(repeat(str,n));

    }
}
