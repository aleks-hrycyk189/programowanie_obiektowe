public class IntegerSet {
    private final boolean[] tablica;

    public IntegerSet()
    {
        this.tablica = new boolean[100];
    }

    public static IntegerSet union(IntegerSet tab1, IntegerSet tab2){
        IntegerSet zbiorNew = new IntegerSet();
        for(int i = 0; i < 100; i++){
            if(tab1.tablica[i] || tab2.tablica[i])zbiorNew.tablica[i] = true;
        }
        return zbiorNew;
    }

    public static IntegerSet intersection(IntegerSet tab1, IntegerSet tab2){
        IntegerSet zbiorNew = new IntegerSet();
        for(int i = 0; i < 100 ;i++){
            if(tab1.tablica[i] && tab2.tablica[i])zbiorNew.tablica[i]=true;
        }
        return zbiorNew;
    }

    public void insertElement(int a){
       if(a<101 && a >= 0) {
           this.tablica[a - 1] = true;
       }else{
           System.out.println("Liczba spoza zakresu");
       }
    }

    public void deleteElement(int a){
        if(a<101 && a >= 0) {
            this.tablica[a - 1] = false;
        }else{
            System.out.println("Liczba spoza zakresu");
        }
    }

    public String toString(){
        StringBuilder liczby = new StringBuilder();
        for(int i=0;i<100;i++){
            if(this.tablica[i]){
                liczby.append(i+1);
                liczby.append(" ");
            }
        }
        return liczby.toString();
    }

    public boolean equals(IntegerSet tab2){
        return this.toString().equals(tab2.toString());
    }
}
