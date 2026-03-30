class BankingApp {

    int balance = 1000;

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankingApp acc = new BankingApp();
        acc.deposit(500);
        acc.withdraw(200);
        acc.checkBalance();
    }
}
