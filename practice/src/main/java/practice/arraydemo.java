package practice;
import java.util.*;
public class arraydemo {
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:\n");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter"+size+"Array elemets are");
		int sum=0;
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
			
	}
}
