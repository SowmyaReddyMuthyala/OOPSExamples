import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeSort {
public static void main(String[] args) {
	List<Integer> l1=new LinkedList<>();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	List<Integer> l2=new LinkedList<>();
	l2.add(3);
	l2.add(12);
	l2.add(16);
	//Collections.sort(l1);
	
	//Collections.sort(l2);
	List<Integer> merge=new LinkedList<>();
	
//	for(int i=0;i<=l1.size();i++) {
//		for(int j=i;i<=l1.size();j++) {
//		if(l1.get(i)<l2.get(j)) 
//			merge.add(l1.get(i));
//		else
//			merge.add(l2.get(j));
//			
//		}
//		System.out.println(merge);
//		
//	}
//	
//	
	
	for(int i=0;i<l1.size();i++) {
		merge.add(l1.get(i));
		}
	
	for(int j=0;j<l2.size();j++) {
		merge.add(l2.get(j));
		}
	
Collections.sort(merge);
for(Integer l:merge) {
	System.out.println(l);
	
}

	
	
	
	
	
		

	}

}
