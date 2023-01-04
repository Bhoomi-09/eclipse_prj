package practice;
import java.util.*;
public class duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1;
		String s2;
		System.out.println("Enter two strings");
		s1=sc.nextLine();
		s2=sc.nextLine();
		if(s1.charAt(s1.length()-1)==s2.charAt(0)){
			System.out.println(s1+s2.substring(1,s2.length()).toLowerCase());
		}
		else {
			System.out.println(s1.concat(s2).toLowerCase());
		}
	}
}