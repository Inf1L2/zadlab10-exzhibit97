package pl.edu.ur.oopl10;

public class Task3a extends java.lang.Exception {


    public static void DzieleniePrzezZero(){
        try {
            int a = 20, b = 0;
            int iloraz = a / b;
            System.out.println("Dzielimy przez zero");
            System.out.println(iloraz);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero!");
        }
    }
}
