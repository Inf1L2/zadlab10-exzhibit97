package pl.edu.ur.oopl10.Zadanie4;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        dividingRandomIntegers();
    }

    public static void dividingRandomIntegers() {
        int counter = 0, i;
        for (i = 0; i <= 100; i++){
            try {
                Random rand = new Random();
                int a = rand.nextInt(10) * (-1);
                int b = rand.nextInt(10);
                System.out.println(a);
                System.out.println(b);
                int division = a / b;

            }
            catch(ArithmeticException e) {
                System.out.println("Dzielenie przez zero!");
                counter += 1;
            }
            if (counter == 3 ){
                System.out.println("3 razy wywalilo blad!");
                break;
            }
        }
    }
}



