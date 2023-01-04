package practice;

public interface shape {
	public void area(int s);
}
class circle implements shape
{

	@Override
	public void area(int s) {
			System.out.println("Area = "+3.14*s*s);
	}
	
	
}
class square implements shape
{
	public void area(int s) {
		// TODO Auto-generated method stub
		System.out.println("Area = "+s*s);
	}
}
