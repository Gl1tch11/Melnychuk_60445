package Melnychuk_60445;
import java.util.Random;
public class Melnychuk_60445 {
    // Metoda generacji liczby losowej
    public static int generaterandomNumber(int n){
        if (n < 0){
            throw new IllegalArgumentException("n must not be negative");
        }
        return new Random().nextInt(n + 1);
    }
    // Metoda wyświatlenia
    public static void main(String[] args) {
        int n = 100;

        if (generaterandomNumber(n)%2==0){
            System.out.println(generaterandomNumber(n));
            System.out.println("Liczba jest parzystą");
        }
        else {
            System.out.println(generaterandomNumber(n));
            System.out.println("Liczba jest nie parzystą");
        }
    }
}
