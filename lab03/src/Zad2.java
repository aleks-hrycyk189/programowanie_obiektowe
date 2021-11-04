import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Zad2 {
    public static int countChar(String zad, char c){
        int counter = 0;
        try {
            File fileToRead= new File(zad);
            Scanner readFile = new Scanner(fileToRead);
            while (readFile.hasNextLine()) {
                String text = readFile.nextLine();
                for(int i=0;i<text.length();i++)
                {
                    if(text.charAt(i) == c)
                    {
                        counter++;
                    }
                }
            }
            readFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
        return counter;
    }


}
