public class TestIntegerSet {
    public static void main(String[] args) {
        IntegerSet tab1= new IntegerSet();
        IntegerSet tab2= new IntegerSet();

        tab1.insertElement(20);
        tab1.insertElement(40);
        tab1.insertElement(60);
        tab1.insertElement(80);

        tab2.insertElement(10);
        tab2.insertElement(20);
        tab2.insertElement(30);
        tab2.insertElement(40);

        System.out.println(tab1);
        System.out.println(tab2);

        System.out.println(IntegerSet.union(tab1, tab2));
        System.out.println(IntegerSet.intersection(tab1, tab2));

        tab2.deleteElement(30);
        System.out.println(tab2);
        System.out.println(tab1.equals(tab2));

        IntegerSet tab3= new IntegerSet();
        tab3.insertElement(10);
        tab3.insertElement(20);
        tab3.insertElement(40);
        System.out.println(tab2.equals(tab3));
    }
}
