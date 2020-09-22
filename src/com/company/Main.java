package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            try {
                System.out.println("Ваш баланс:" + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    System.out.println("Ваш баланс:" + bankAccount.getAmount());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                break;
            }
        }

    }
}
