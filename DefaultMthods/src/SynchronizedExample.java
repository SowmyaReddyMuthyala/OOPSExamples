
class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<10;i++) {
			System.out.println("good morning:");
			try {
				Thread.sleep(2000);
				}
catch(InterruptedException e) {}
				System.out.print(name);
			}
			}
		}
class MyThread extends Thread{
		Display d;
		String name;
		MyThread(Display d,String name){
			this.d=d;
			this.name=name;
		}
			public void run() {
				d.wish(name);
			}
		}
		

class MyThread1 extends Thread{
	Display d;
	String name;
	MyThread1(Display d,String name){
		this.d=d;
		this.name=name;
	}
		public void run() {
			d.wish(name);
		}
	}
	
public class SynchronizedExample {
public static void main(String[] args) {
Display d=new Display();
MyThread1 my=new MyThread1(d,"sowmya");
MyThread my1=new MyThread(d,"reddy");
my.start();
my1.start();
}
}
	



