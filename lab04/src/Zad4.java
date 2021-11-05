import java.util.ArrayList;

public class Zad4 {
    public static ArrayList<Integer>reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> nowaLista = new ArrayList<Integer>();

        for(int i = a.size(); i > 0; i--){
            nowaLista.add(a.get(i-1));
        }
        return nowaLista;
    }
}




