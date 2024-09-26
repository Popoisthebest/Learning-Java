package Habitate.BankAccount;

public class Customer {
    String firstName;
    String lastName;
    BankAccount account;
    
    Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = new BankAccount(0);
    }
    
    String getFirstName() {
        return firstName;
    }
    
    String getLastName() {
        return lastName;
    }
    
    BankAccount getAccount() {
        return account;
    }
    
    void setAccount(BankAccount bankAccount) {
        this.account = bankAccount;
    }
    
    public String toString() {
        return "이름: " + getFirstName() + " " + getLastName() + ", 잔고: " + getAccount() + "원";
    }
}
