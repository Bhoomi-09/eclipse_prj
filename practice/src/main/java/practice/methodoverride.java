package practice;
import java.util.*;
public class methodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rsize;
		int csize;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		rsize=sc.nextInt();
		csize=sc.nextInt();
		int [][]mat=new int[rsize][csize];
		System.out.println("Enter"+rsize+"array elemets");
		for(int i=0;i<rsize;i++) {
			for(int j=0;j<csize;j++) {
				mat[i][j]=sc.nextInt();
			
			}
		}
		System.out.println("Matrix is");
		for(int i=0;i<rsize;i++) {
			for(int j=0;j<csize;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		for(int x[]:mat) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
