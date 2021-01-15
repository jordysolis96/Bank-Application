import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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
        if(Choice == 1){
            checkBalance.viewBalance();
        }else if(Choice == 5){
                exitBank.exit();
            }
        return bankMenu();
    }

//    public static boolean viewBalance() throws IOException {
//        Path balancePath = Paths.get("src", "Balance.txt");
//        List<String> bankAccount = Files.readAllLines(balancePath);
//        try {
//            bankAccount = Files.readAllLines(balancePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < bankAccount.size(); i++) {
//            System.out.println((i + 1) + ": " + bankAccount.get(i));
//        }
//        return false;
//    }

}
