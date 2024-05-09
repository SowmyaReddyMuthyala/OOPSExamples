
public class MultiThreading {

	public static void main(String[] args) throws Exception {
		Bricks b=new Bricks();
		Runnable r1=()->{
			for(int i=0;i<1000;i+=50) {
				b.bricksCountIncrement();
			}
		};
		
		
		Runnable r2=()->{
			for(int i=0;i<1000;i+=50) {
				b.bricksCountIncrement();
			}
		};
		
		Runnable r3=()->{
			for(int i=0;i<1000;i+=50) {
				b.bricksCountIncrement();
				
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		System.out.println(b.bricks);
		
		
		
		}
	}
class Bricks {
	
	int bricks=0;
	synchronized void bricksCountIncrement() {
		bricks=bricks+50;
	}
	
	
	
}
