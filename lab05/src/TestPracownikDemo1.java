public class TestPracownikDemo1 {
    public static void main(String[] args) {
        PracownikDemo1[] personel = new PracownikDemo1[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new PracownikDemo1("Karol Cracker", 75000, 2001, 12, 15);
        personel[1] = new PracownikDemo1("Henryk Hacker", 50000, 2003, 10, 1);
        personel[2] = new PracownikDemo1("Antoni Tester", 40000, 2005, 3, 15);

        for (PracownikDemo1 e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();
        // zwiększ pobory każdego pracownika o 20%
        for (PracownikDemo1 e : personel) {
            e.zwiekszPobory(20);
        }

        System.out.println("Pobory po powiększeniu");
        // wypisz informacje o każdym pracowniku
        for (PracownikDemo1 e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

    }
}

