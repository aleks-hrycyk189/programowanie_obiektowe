import java.util.ArrayList;

public class Zad1 {
    public static ArrayList<Integer>append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> nowaLista = new ArrayList<Integer>(a);
        nowaLista.addAll(b);
        return nowaLista;
    }
}

