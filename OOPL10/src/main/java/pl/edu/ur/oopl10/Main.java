package pl.edu.ur.oopl10;

import java.util.Random;
import java.util.Scanner;

import static pl.edu.ur.oopl10.Task3a.*;

/**
 *
 * @author mchla
 */
public class Main {

    public static void main(String[] args) {

    wprowadzInt();
    wprowadzString();
    AIOOBExample();
    DzieleniePrzezZero();
    }

    static void wprowadzInt(){
        try{
            Scanner scan = new Scanner(System.in);
            int liczba = 0;
            System.out.println( "Wprowadz liczbe calkowita");
            liczba = scan.nextInt();
        }
        catch (Exception e) {
            System.out.println("Nie wprowadziles liczby calkowitej!!!");
        }
    }
    static void wprowadzString(){
        try{
            Scanner scan = new Scanner(System.in);
            String tekst;
            System.out.println("Wprowadz tekst!");
            tekst = scan.nextLine();
        }
        catch (Exception e) {
            System.out.println("Nie wprowadziles tekstu!!!");
        }
    }
    static void AIOOBExample(){
        try {
            int[] HundredIntArray = new int[100];
            Random rand = new Random();
            for (int i = 0; i <= HundredIntArray.length; i++) {
                HundredIntArray[i] = rand.nextInt(100);
            }
            System.out.println("Finished randomizing array elements!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds!");
        }
    }
}
