import java.util.Scanner;

public class ArraySumExample {
public static void main(String[] args) {
	
int[] arr= {1,2,3,4,5};	
int k=5;
int result=0;
int n=arr.length;
for(int i=0;i<=n;i++) {
int sum=0;
for(int j=i;j<=n;j++) {
sum=i+j;
if(sum==k) {
result++;
}
}
}
System.out.println(result);
}
}
