import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String sc=new String("sandeep");
//		StringBuffer str=new StringBuffer();
//		Set<Character> s=new HashSet<>();
//	for(int i=0;i<sc.length();i++) {
//			Character ch=sc.charAt(i);
//			if(!s.contains(ch)) {
//				s.add(ch);
//				str.append(ch);
//			
//				}
//			
//		}
//	System.out.println(str);
//		
//		
//	String str="welcome to java world";
//	String str1 = null;
//	char[] ch=str.toCharArray();
//	for(int i=ch.length-1;i>0;i--) {
//		str1=Character.toString(ch[i]);
//		System.out.println(str1);
//	}
//	
//	char[] ch1=str1.toCharArray();
//	for(int i=ch1.length-1;i>=0;i--) {
//		//str1=Character.toString(ch[i]);
//		System.out.println(str1);
//	}
//	
//	
	
		
//	String str="madam";	
//	String rev="";
//	
//for(int i=str.length()-1;i>=0;i--) {
//rev=str.charAt(i)+rev;
//}
//System.out.println(rev.equals(str));
//
//if(rev.equals(str)) 
//System.out.println("is pallindrome");
//else
//System.out.println("is not pallindrome");
		
		
		
//		int arr[]= {1,2,3,4,5};
//		int new_arr[]=new int[arr.length-1];
//		
//		for(int i=0,k=0;i<arr.length;i++) {
//			int j=2;
//			if(i!=j) {
//				new_arr[k]=arr[i];
//				k++;
//				
//				
//			}
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(new_arr));

		
		String str="hello java world";
		String[] a=str.split(" ");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			if(a[i].length()%2==0) {
			System.out.println(a[i]);
			
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
