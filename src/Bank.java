import java.io.IOException;
import java.util.Scanner;

public class Bank {

    public static boolean bankMenu() throws IOException {
        Scanner choice = new Scanner(System.in);
        System.out.println(1 + "." + " " + "Check balance");
        System.out.println(4 + "." + " " + "Withdraw");
        System.out.println(2 + "." + " " + "Deposit");
        System.out.println(3 + "." + " " + "Transfer");
        System.out.println(5 + "." + " " + "Quit");
        System.out.println("Select an option by entering the corresponding number.");
        int Choice = choice.nextInt();
        if(Choice == 5){
            System.out.println("Ending session...");
            System.out.println("Goodbye");
                System.exit(0);
            }
        return bankMenu();
    }

}
