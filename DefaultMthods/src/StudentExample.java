import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentExample {

public static void main(String[] args) {
	Student s1=new Student("sowmya", 20);
	Student s2=new Student("sowkya", 25);
	Student s3=new Student("sahithi", 24);
List<Student> list=new ArrayList<>();
list.add(s1);
list.add(s2);
list.add(s3);
Collections.sort(list);

for(Student l:list) {
	System.out.println(l.getAge()+" "+l.getName());
	
}



	}

}
