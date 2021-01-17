package Version2;
import java.util.Random;
import java.util.Scanner;

public class BankAppv2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 100;
        int balance = rand.nextInt(upperbound);
        Scanner choice = new Scanner(System.in);
        System.out.println(1 + "." + " " + "Check balance");
        System.out.println(2 + "." + " " + "Version1.Withdraw");
        System.out.println(3 + "." + " " + "Deposit");
        System.out.println(4 + "." + " " + "Transfer");
        System.out.println(5 + "." + " " + "Quit");
        System.out.println("Select an option by entering the corresponding number.");
        int Choice = choice.nextInt();
    }
}