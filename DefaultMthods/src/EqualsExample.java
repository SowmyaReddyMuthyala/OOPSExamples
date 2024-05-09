

	



public class EqualsExample {
public static void main(String[] args) {
	Employee emp1=new Employee("sowmya", 25, 250);
	Employee emp2=new Employee("sowmya", 25, 250);
	System.out.println(emp1.equals(emp2));
	String s1=new String("sowmya");
	String s2=new String("sowmya");
	System.out.println(s1.equals(s2));
	
	}

}
