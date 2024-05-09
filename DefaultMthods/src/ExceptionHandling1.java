
class AgeLimit extends Exception{

	AgeLimit(String str) {
		System.out.println(str);
	}

	}
class Age{
void vote(int n) throws AgeLimit    {
if(n<18) {
throw new AgeLimit("age should be above 18");
}
else {
	System.out.println("your eligible for vote");
}
}
}
public class ExceptionHandling1 {
public static void main(String[] args) {
	
	Age a=new Age();
	try {
		a.vote(10);
	} catch (AgeLimit e) {

		System.out.println("not suffient");
	}
	finally{
		System.out.println("thank you!");
	}

	}

}
