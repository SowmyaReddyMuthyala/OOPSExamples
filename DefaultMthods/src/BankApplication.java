
class Deposit {
	
double balance=0;
public synchronized void deposit(double amount) {
if(amount>=0) {
balance=balance+amount;
System.out.println("you have deposited"+amount);
System.out.println("now you have "+balance);
notify();
}
else {
System.out.println("Invalid deposit amount. Please deposit a positive amount.");
}
}
	
	public synchronized void withdraw(double amount) {
		if(balance>=amount ) {
			balance=balance-amount;
			
			System.out.println("you have withdrawn "+amount);
			System.out.println("you have balanced amount"+balance);
		}
		else {
		
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            // If there are insufficient funds or invalid withdrawal amount, wait for deposit
            try {
                wait(); // Wait for deposit to be performed by another thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		
			}
	
	}


public class BankApplication {
public static void main(String[] args) {
	Deposit a=new Deposit();
	Thread depositThread1 = new Thread(() -> {
		a.deposit(0);
    });
Thread depositThread = new Thread(() -> {
		a.withdraw(100);
    });
	
	depositThread1.start();
	depositThread.start();
	
	}

}
