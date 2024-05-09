import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HackerRankExample {
	
	
	static Iterator func(ArrayList mylist)
	   {
	      Iterator it=mylist.iterator();
	      while(it.hasNext())
	      {
	         Object element = it.next();
	         if(element instanceof String) //Hints: use instanceof operator
	            break;
	      }
	      return it;
	      
	   }
		
		
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		
		   
		      ArrayList mylist = new ArrayList();
		      Scanner sc = new Scanner(System.in);
		      System.out.println("enter nmae");
		      int n = sc.nextInt();
		      int m = sc.nextInt();
		      for(int i = 0;i<n;i++){
		         mylist.add(sc.nextInt());
		      }
		      
		      mylist.add("###");
		      for(int i=0;i<m;i++){
		         mylist.add(sc.next());
		      }
		      
		      Iterator it=func(mylist);
		      System.out.println(it);
		      while(it.hasNext()){
		         Object element = it.next();
		         System.out.println("hello");
		         System.out.println((String)element);
		      }
		   

	}

}
