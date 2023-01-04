package practice;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		if(s.contentEquals(sb)){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.print(s.toUpperCase());
		String s2=new String("abcd");
		for(int i=0;i<s.length();i++) {
			
		}
	}
}
