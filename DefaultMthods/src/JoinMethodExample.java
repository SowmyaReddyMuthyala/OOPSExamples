
class JoinExample extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("child thread");
		
			}
	}
}

public class JoinMethodExample {

	public static void main(String[] args) throws InterruptedException {
		JoinExample jn=new JoinExample();
		jn.start();
	jn.yield();
		for(int i=1;i<=10;i++) {
			System.out.println("main thread");
			
		}
	

	}

}
