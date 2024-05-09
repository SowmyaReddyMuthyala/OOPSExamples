
public class RemoveCharacterExample {

	public static void main(String[] args) {
		String str="cloudtech";
		//char[] ch=str.toCharArray();
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='c') {
				str1=str1+str.charAt(i);
				}
			System.out.println(str1);
			
			
			
		}


	}

}
