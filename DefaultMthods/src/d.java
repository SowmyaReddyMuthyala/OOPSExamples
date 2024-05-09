interface A{
	void say();
	default  void sayAny() {
		System.out.println("hello everyone");
		}
}
class B implements A{

	@Override
	public void say() {
		System.out.println("hello");
		}
	
	}


public class d {
	
public static void main(String[] args) {
		
B b=new B();
b.say();
b.sayAny();

	}

}
