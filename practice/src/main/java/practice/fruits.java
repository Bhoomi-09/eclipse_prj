package practice;
import java.util.Arrays;
import java.util.Scanner;
public class fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter"+size+"array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		
		int minele=a[0];
		int maxele=a[0];
		for(int i=0;i<size;i++) {
			minele=Math.min(minele,a[i]);
			maxele=Math.max(maxele,a[i]);
		}
		
		Arrays.sort(a);
		System.out.println(a[0]+","+a[size-1]);
		System.out.println(maxele-minele);
	}

}
