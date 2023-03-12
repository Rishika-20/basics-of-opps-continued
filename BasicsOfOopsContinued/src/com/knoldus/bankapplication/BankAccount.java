package com.knoldus.bankapplication;
import java.util.Scanner;

public class BankAccount {
        private double balance;

        public double getBalance(String password) {
            // authentication mechanism
            if (password.equals("hello@knolder")) {
                return balance;
            } else {
                System.out.println("Invalid User!");
                return 0.0;
            }
        }
        protected void setBalance(double newBalance, String permissionaccess) {
            // to check authorization.
            if (permissionaccess.equals("admin")) {
                balance = newBalance;
            }
        }
        public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the role(admin/other) of user:");
        String permissionaccess = scan.next();
        bankAccount.setBalance(50000, permissionaccess);

        System.out.println("Please enter the password of your account: ");
        String password = scan.next();
        System.out.println("Balance is: $"+bankAccount.getBalance(password));
    }
}


