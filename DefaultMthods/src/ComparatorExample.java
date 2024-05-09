import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Employee e1=new Employee("sowmya", 24, 250);
		Employee e2=new Employee("sowkya", 25, 260);
		Employee e3=new Employee("sahithi", 26, 270);
		List<Employee> list=new LinkedList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Collections.sort(list,new AgeComparator());	
		Collections.sort(list,new NameComparator());	
		
		
		
		
		for(Employee e:list) {
			System.out.println(e.getName()+" "+e.getAge());
			}
		
		
	}

}
