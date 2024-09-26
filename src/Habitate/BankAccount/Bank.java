package Habitate.BankAccount;

public class Bank {
    Customer[] customers;
    int numberOfCustomers;
    
    Bank() {
        this.customers = new Customer[10];
    }
    
    void addCustomer(Customer customer) {
        this.numberOfCustomers++;
    }
    
    int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    
    Customer[] getCustomers() {
        return customers;
    }
    
    Customer getCustomer(int index) {
        return customers[index];
    }
}
