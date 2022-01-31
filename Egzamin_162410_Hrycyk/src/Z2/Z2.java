package Z2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Z2 {
    public static <E extends Iterable<?>> void wypiszCoDrugi(E element){
        Iterator <?> iterator = element.iterator();
        System.out.print(iterator.next() + ", ");
        while(iterator.hasNext()){
            iterator.next();
            if(iterator.hasNext()){
                System.out.print(iterator.next() + ", ");
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        wypiszCoDrugi(lista1);
        System.out.println("");
        System.out.println("Przykład drugi: ");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Java");
        lista2.add("Python");
        lista2.add("C#");
        lista2.add("C++");
        lista2.add("JavaScript");
        wypiszCoDrugi(lista2);


    }

}
