
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private List<Customers> customers;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void addCustomer(Customers customer) {
        customers.add(customer);
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; 
    }

   
}