
class Sowmya{  
int rollno;  
String name;  
float fee;  
Sowmya(int rollno,String name,float fee){  
this.rollno=rollno;  
name=name;  
fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  

public class ThisKeywordExample {

	public static void main(String[] args) {
		Sowmya s1=new Sowmya(111,"ankit",5000f);  
		Sowmya s2=new Sowmya(112,"sumit",6000f);  
		s1.display();  
		s2.display(); 
		
	}

}
