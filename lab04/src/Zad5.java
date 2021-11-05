import java.util.ArrayList;

public class Zad5 {
    public static void reverse(ArrayList<Integer> a)
    {
        int temp;
        int k = 0;

        for(int i = a.size(); i > 0; i--){
            temp = a.get(k);
            if(a.size() /2 < i) {
                a.set(k, a.get((i - 1)));
                a.set(i - 1, temp);
                k++;
            }
        }
    }
}


