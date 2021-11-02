package bankAccount;

import java.util.Scanner;

public class MyBankAccount {

    public static void main(String[] args) {

        //Utöka mainklassen så att vi kan sätta in pengar ifrån kommandoraden
        // i all oändlighet. Programmet skriver därefter ut saldot

        Scanner scan = new Scanner(System.in);
        BankAccount bank = new BankAccount();

        System.out.println("Please add some money!!!");

      //  int addedAmount;

        while (true) {
            int addedAmount = Integer.parseInt(scan.nextLine());

            //bank.increaseBalance(addedAmount);

            System.out.println("Your balance is now: " + bank.getBalance());

        }
    }

}
