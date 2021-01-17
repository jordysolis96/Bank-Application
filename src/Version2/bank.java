package Version2;

import java.util.Random;
import java.util.Scanner;

public class bank {
    public static boolean bankMenu() {
        Random rand = new Random();
        int upperbound = 100;
        int balance = rand.nextInt(upperbound);
        Scanner choice = new Scanner(System.in);
        System.out.println(1 + "." + " " + "Check balance");
        System.out.println(2 + "." + " " + "Withdraw");
        System.out.println(3 + "." + " " + "Deposit");
        System.out.println(4 + "." + " " + "Transfer");
        System.out.println(5 + "." + " " + "Quit");
        System.out.println("Select an option by entering the corresponding number.");
        int Choice = choice.nextInt();
        if (Choice == 1) {
            System.out.println("Your current balance is: $" + balance);
        }else if(Choice == 2){
            System.out.println("How much would you like to withdraw?");
            int withdraw = choice.nextInt();
            System.out.println("You took out: " + withdraw);
            System.out.println("Your current balance now is: " + (balance - withdraw));
        }else if(Choice == 5){
            System.exit(0);
        }
        return bankMenu();
    }
}
