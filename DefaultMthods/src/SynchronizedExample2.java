class Demo{
	public synchronized void display1() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
				}
		}
	
public synchronized void display2() {
	for(int i=65;i<=75;i++) {
		System.out.println((char)i);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {}
			}
	}
}

class DemoThread1 extends Thread{
	Demo d;
	DemoThread1(Demo d){
		this.d=d;
		}
	
	public void run() {
		d.display1();
	}
}

class DemoThread2 extends Thread{
	Demo d;
	DemoThread2(Demo d){
		this.d=d;
		}
	public void run() {
		d.display2();
	}
}

public class SynchronizedExample2 {
public static void main(String[] args) {
	Demo d=new Demo();
	DemoThread1 my1=new DemoThread1(d);
	DemoThread2 my2=new DemoThread2(d);
	my1.start();
	my2.start();
	}
}


