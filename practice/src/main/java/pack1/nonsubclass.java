package pack1;

public class nonsubclass {
	nonsubclass(){
		sameclass sc= new sameclass();
		System.out.println("Default access"+"specifier:"+sc.d);
		//System.out.println("private access"+"specifier:"+sc.p);
		System.out.println("protected access"+"specifier:"+sc.pro);
		System.out.println("publc access"+"specifier:"+sc.d);
	}
}
