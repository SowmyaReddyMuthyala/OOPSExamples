
class ThreadDemo extends Thread{
	public void start() {
		//
		super.start();
		System.out.println("start method");
	}
	public  void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("child thread");
			
		}
	}
}

public class ExampleOfThreadClass {
public static void main(String[] args) {
	ThreadDemo d=new ThreadDemo();
	d.start();
	System.out.println("main thread");
		}
}
