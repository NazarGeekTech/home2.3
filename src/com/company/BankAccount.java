package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        //  amount = amount + sum ;
        amount += sum;
    }

    public Double withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("У вас недостаточно денег на балансе ", getAmount());
        }
        amount -= sum;
        System.out.println("Снимаем с баланса " + sum);
        return amount;
    }

}

