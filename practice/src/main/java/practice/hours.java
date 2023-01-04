package practice;
import java.util.*;
public class hours {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sec,min,hr;
		sec=sc.nextInt();
		hr=(sec/3600)%24;
		min=(sec%3600)/60;
		sec=sec%60;
		System.out.printf("%d:%0,2d:%0,2d",hr,min,sec);	
		System.out.println();
		System.out.printf(hr+":"+String.format("%02d", min)+":"+String.format("%02d", min));
	}
	
}