import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Zad3 {
    public static int countString(String file_name, String text){
        int wynik = 0;
        try{
            File file = new File(file_name);
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                String zad = read.nextLine();
                for (int i = 0; i < zad.length() - text.length() + 1; i++) {
                    if (zad.substring(i, i + text.length()).equals(text)) {
                        wynik += 1;
                    }
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Nie ma pliku");
            e.printStackTrace();
            return -1;
        }
        return wynik;
    }
}
