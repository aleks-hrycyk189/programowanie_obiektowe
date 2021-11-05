import java.util.ArrayList;
import java.util.Comparator;

public class Zad3 {
    public static ArrayList<Integer>mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        int sizea = a.size();
        int sizeb = b.size();

        ArrayList<Integer> nowaLista = new ArrayList<>(a);

        nowaLista.addAll(b);
        nowaLista.sort(Comparator.naturalOrder());

        return nowaLista;

    }
}
