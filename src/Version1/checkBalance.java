package Version1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class checkBalance {

    public static boolean viewBalance() throws IOException {
        Path balancePath = Paths.get("src", "Version1/Balance.txt");
        List<String> bankAccount = Files.readAllLines(balancePath);
        System.out.println("-----------------------------------");
            System.out.println("Your current balance is: " + "$" + bankAccount);
        System.out.println("-----------------------------------");
        return false;
    }

}


