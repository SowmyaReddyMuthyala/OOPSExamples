
class X extends Thread{
public synchronized void run() {

	for(int i=1;i<=10;i++) {
		System.out.println("child thread");		
	}
		
	}
}

public class SyEx {
public static void main(String[] args) {
X x=new X();
x.start();
}

}
