import java.util.ArrayList;

public class Zad2 {
    public static ArrayList<Integer>merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> nowaLista = new ArrayList<Integer>();
        for(int i = 0; i < (a.size() + b.size()); i++)
        {
            if(a.size() > i)
                nowaLista.add(a.get(i));
            if(b.size() > i)
                nowaLista.add(b.get(i));
        }
        return nowaLista;
    }
}









