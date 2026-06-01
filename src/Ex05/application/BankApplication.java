package Ex05.application;

import Ex05.application.entities.Account;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account;
        int option = -5;


        System.out.print("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the holder: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Initial deposit? (y/n): ");
        String balanceOption = scanner.nextLine();

        if (balanceOption.equalsIgnoreCase("n")) {
            account = new Account(accountNumber, accountHolder);
        } else {
            System.out.print("Enter the deposit: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        }


        while (option != 0) {
            account.interactiveMenu();

            option = scanner.nextInt();

            switch (option) {

                case 1: {
                    System.out.print("Enter the amount: ");
                    double depositAmount = scanner.nextDouble();

                    account.deposit(depositAmount);
                    break;
                }

                case 2: {
                    System.out.print("Enter the amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;
                }
                case 3: {
                    scanner.nextLine();

                    System.out.println("Enter the new owner: ");
                    String updatedAccountHolder = scanner.nextLine();
                    account.setHolder(updatedAccountHolder);
                    break;
                }

                case 4: {
                    account.accountStatus();
                    break;
                }

                case 0: System.out.println("Leaving...");

                default:
                    System.out.println("Invalid option");
                    break;

            }

        }

        scanner.close();
    }

}
