public class BankSynchronization {
	private double balance;

	public BankSynchronization(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		synchronized(this){
		double newBalance=balance+amount;
		System.out.println(Thread.currentThread().getName()+" deposit"+newBalance);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			}
		balance=newBalance;
		//System.out.println(Thread.currentThread().getName()+"deposit "+balance);
		}
	}
	public void withdraw(double amount) {
		 synchronized(this) {
		if(balance>=amount) {
			double newBalance=balance-amount;
			System.out.println(Thread.currentThread().getName()+"withdraw "+newBalance);
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			balance=newBalance;
			System.out.println(Thread.currentThread().getName()+"withdraw "+balance);
			}
		 }
		}
	
	
	public double getBalance() {
		return balance;
		
	}
	
	
public static void main(String[] args) {
BankSynchronization account=new BankSynchronization(100);
System.out.println(account.getBalance()+"balance");
Thread deposit1=new Thread(()->account.deposit(10),"deposit1");
Thread deposit2=new Thread(()->account.deposit(10),"deposit2");
Thread withdraw1=new Thread(()->account.withdraw(20),"withdraw1");
Thread withdraw2=new Thread(()->account.withdraw(20),"withdraw2");
Thread t1=new Thread();


deposit1.start();
deposit2.start();
withdraw1.start();
withdraw2.start();
try {
	deposit1.join();
	deposit2.join();
	withdraw1.join();
	withdraw2.join();
	}catch(InterruptedException e) {
		throw new RuntimeException();
		
	}
System.out.println("final balance:"+account.getBalance());
}


}
