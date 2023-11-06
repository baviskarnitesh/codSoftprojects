package com.ATM;
import java.util.Scanner;

public class ATM {
 
	private BankAccount userAccount;

    public ATM(BankAccount account) {
        userAccount = account;
    }
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
      
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    withdraw(withdrawalAmount);
                    break;
                    
                case 4:
                    System.out.println("Exiting ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }

    public void checkBalance() {
        double balance = userAccount.getBalance();
        System.out.println("Account balance: $" + balance);
    }
    
    public void deposit(double amount) {
        userAccount.deposit(amount);
    }   
    public void withdraw(double amount) {
        if (userAccount.withdraw(amount)) {
            System.out.println("Successful withdrawal.");
        }
    }
  
    
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000.0); 
        ATM atm = new ATM(account);

        System.out.println("Welcome to the ATM!");
        atm.displayMenu();
    }
	}


