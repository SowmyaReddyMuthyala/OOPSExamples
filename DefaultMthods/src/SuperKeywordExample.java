
class Donkey{
	String color="red";
	
	void color() {
		System.out.println("color from donkey");
	}
	Donkey(){
		System.out.println("constructor from Donkey");
	}
	
	
	
	}
class Hen extends Donkey{
	String color="black";
	
	Hen(){
		super();
		System.out.println("constructor from hen");
	}
	
	void get() {
	System.out.println(color);
	System.out.println(super.color);
	}
	
	void color() {
		System.out.println("color from Hen");
	}
	void gain() {
		super.color();
	}
}

public class SuperKeywordExample {

	public static void main(String[] args) {
		Hen c=new Hen();
		c.get();
		c.gain();

	}

}
