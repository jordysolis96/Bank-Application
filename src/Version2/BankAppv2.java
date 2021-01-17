package Version2;
import java.util.Random;

public class BankAppv2 {
    public static void main(String[] args) {
       Random rand = new Random();
       int upperbound = 100;
       int balance = rand.nextInt(upperbound);
        System.out.println(balance);
    }

}
