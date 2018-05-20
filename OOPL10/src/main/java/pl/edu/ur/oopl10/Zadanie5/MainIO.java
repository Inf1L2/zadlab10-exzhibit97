package pl.edu.ur.oopl10.Zadanie5;

import java.io.*;
import java.util.Scanner;

public class MainIO {
    public static void main(String[] args) {
    Write();
    Read();
    }
    public static void Write() {
        String filePath = "C:\\Users\\Patryk\\Desktop\\file.txt";
        String tekst = "ala ma kota";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(tekst);
            fileWriter.close();
            System.out.println("Tekst wpisany!!!");
        }
        catch(IOException e){
            System.out.println("Blad IOException Write");
        }
    }
    public static void Read() {
        String filePath = "C:\\Users\\Patryk\\Desktop\\file2.txt";
        String tekst;
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            String readText = fileReader.readLine();
            System.out.println(readText);
            fileReader.close();
        } catch(FileNotFoundException e){
            System.out.println("Plik nie istnieje!");
        } catch(IOException e){
            System.out.println("Problem IOException Read");
        }
    }
}
