import java.util.Arrays;

class Hello{
	private String firstname;
	private String lastname;
	private Course course[];
	
	

	public Hello(String firstname, String lastname, Course course[]) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
	}



	@Override
	public String toString() {
		return "Hello [firstname=" + firstname + ", lastname=" + lastname + ", course=" + Arrays.toString(course) + "]";
	}

	
	
	
}
class Course{
	private int id;
	private String cname;
	public Course(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", cname=" + cname + "]";
	}
	
	
	
	
}


public class Emp {
public static void main(String[] args) {
	Course s1=new Course(10, "java");
	Course s2=new Course(10, "java");
	Course[] s3= {s1,s2};
	Hello a=new Hello("sowmya","reddy", s3);
	System.out.println(a);
	

	}

}
