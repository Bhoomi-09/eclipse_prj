package practice;

public interface fruit {
	//String name=fruitss;
	//String taste;
	//String size;
	public void eat();
}
class apple implements fruit
{
	public void eat()
	{
		System.out.println("Apple");
		System.out.println("tate : Sweet");
		System.out.println("Size : Round");
	}
}
class orange implements fruit
{
	public void eat()
	{
		System.out.println("Orange");
		System.out.println("tate : Sour");
		System.out.println("Size : Oval");
	}
}
