public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Customers customer = new Customers(123, " Ali", "Amman", "0791234567");
        Account account = new Account(1001, "Ahmmad", "..");
        bank.addCustomer(customer);
        bank.addAccount(account);

        Account foundAccount = bank.findAccount(1001);
        if (foundAccount != null) {
            foundAccount.deposit(1000);
            foundAccount.withdraw(500);
            foundAccount.displayBalance();
        }
    }
}