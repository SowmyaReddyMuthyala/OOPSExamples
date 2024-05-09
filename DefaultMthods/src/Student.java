
public class Student implements Comparable<Student> {
	
	private String name;
	private int age;
	
	
	
	
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}


public int getAge() {
		return age;
	}


public void setAge(int age) {
		this.age = age;
	}

public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}



	@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}
	
	public int compareTo(Student st){
		return this.getName().compareTo(getName());  
		
//		if(age==st.age)  
//			return 0;  
//			else if(age>st.age)  
//			return 1;  
//			else  
//			return -1;  
//			
//		
//		
		
		}
		
}