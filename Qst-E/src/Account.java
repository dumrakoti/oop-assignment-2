public class Account {
    private String id;
    private String name;
    private double balance;

    // Constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0; // Initialize balance to 0
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Method to credit (add) an amount to the balance
    public void credit(double amount) {
        balance += amount;
    }

    // Method to debit (subtract) an amount from the balance
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method to transfer an amount from this account to another account
    public void transferTo(Account anotherAccount, double amount) {
        if (amount <= balance) {
            debit(amount); // Deduct from this account
            anotherAccount.credit(amount); // Credit to the other account
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public static void main(String[] args) {
        // Test the Account class
        Account account1 = new Account("001", "John Doe");
        Account account2 = new Account("002", "Jane Smith");

        account1.credit(1000.0);
        System.out.println("Account 1 balance after credit: $" + account1.getBalance());

        account1.debit(500.0);
        System.out.println("Account 1 balance after debit: $" + account1.getBalance());

        account1.transferTo(account2, 200.0);
        System.out.println("Account 1 balance after transfer: $" + account1.getBalance());
        System.out.println("Account 2 balance after transfer: $" + account2.getBalance());
    }
}
