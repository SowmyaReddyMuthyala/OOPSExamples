


class MyCustomException extends Exception {
	    /**
	 * 
	 */
	//private static final long serialVersionUID = -7431475530668917731L;

		public MyCustomException(String message) {
	        super(message);
	    }
	}


class Age1{
	void vote(int n) {
		try {
		if(n<18) {
			throw new MyCustomException("age is not sufficient");
		}
		else
		{
			System.out.println("age is sufficient ");
		}
		}
		
		catch (MyCustomException e) {
            System.out.println("Caught MyCustomException: " + e.getMessage());
        }
		
	}
}

public class ExplicitExceptionExample {
public static void main(String[] args) {
	
	Age1 a=new Age1();
	a.vote(20);
}}
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	