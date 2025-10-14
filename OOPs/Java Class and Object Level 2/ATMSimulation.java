class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }

    void display() {
        System.out.println("Holder : " + accountHolder);
        System.out.println("Number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}