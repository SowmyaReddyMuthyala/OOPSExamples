import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		
		int[] n= {1,2,3,4,56,77,8,2,3};
		Set<Integer> s=new HashSet<>();
		
		for(int i=0;i<n.length;i++) {
			if(s.add(n[i])) {
				
				//System.out.println(s);
			}
			
		
	

}
		for(Integer l:s) {
			System.out.println(l);
	
}
		
		
		
	}
}
