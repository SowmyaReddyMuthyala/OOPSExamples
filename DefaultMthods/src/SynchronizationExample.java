



class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient funds for withdrawal");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class AccountHolder implements Runnable {
    private BankAccount account;
    private double amount;

    public AccountHolder(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        // Simulate deposit and withdrawal operations
        for (int i = 0; i < 3; i++) {
            account.deposit(amount);
            account.withdraw(amount);
        }
    }
}


public class SynchronizationExample {

	public static void main(String[] args) {
		
		
		BankAccount account = new BankAccount(1000.0);
        AccountHolder holder1 = new AccountHolder(account, 100.0);
        AccountHolder holder2 = new AccountHolder(account, 150.0);

        Thread thread1 = new Thread(holder1, "User 1");
        Thread thread2 = new Thread(holder2, "User 2");

        thread1.start();
        thread2.start();
		
		
		
		
		
		
		
	}

}
