public class ExceptionHandling {
public static void main(String[] args) {
	

	int a=10;
	int b=0;
	int[] n= {1,2,3,4};
	
try{

int c=a/b;
System.out.println(n[6]);
System.out.println(c);
}

catch(ArithmeticException ex) {
System.out.println(a+" cannot divisible by zero");
}

catch(ArrayIndexOutOfBoundsException e) {
System.out.println("value is unlimited");
}

}

}
