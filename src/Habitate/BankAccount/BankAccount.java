package Habitate.BankAccount;

public class BankAccount {
    int balance;
    
    BankAccount(int balance) {
        this.balance = balance;
    }
    
    int getBalance() {
        return balance;
    }
    
    void deposit(int amount) {
        balance += amount;
    }
    
    boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
    
    boolean transfer( int amount, BankAccount destination) {
        if (balance < amount) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
