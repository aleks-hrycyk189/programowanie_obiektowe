package pl.imiajd.hrycyk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        if (args.length != 0) {
            try {
                File plik = new File("zad.txt");
                Scanner scan = new Scanner(plik);
                while (scan.hasNextLine()) {
                    lista.add(scan.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Brak pliku o podanej nazwie");
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}
