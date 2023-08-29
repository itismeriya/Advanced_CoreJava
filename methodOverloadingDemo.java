package overloading;

public class methodOverloadingDemo {
	/*
	 * 1. Number of parameter
	 * 2. Datatype of parameter
	 * 3. Sequence of parameter
	 */
	
	
	static int addition(int a)
	{
		return(a+23);
	}
	static void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	static void addition(int a,float b)
	{
		System.out.println(a+b);
	}
	static void addition(float a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		//overloadingDemo demo = new overloadingDemo();
		System.out.println(methodOverloadingDemo.addition(23));
		//overloadingDemo.addition(23);
		methodOverloadingDemo.addition(23,40,80);
		methodOverloadingDemo.addition(30,40.3f);
		methodOverloadingDemo.addition(34.8f,40);
	}
}
