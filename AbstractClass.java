package OOPS;

abstract class Hillstations
{  
	abstract void location();
	abstract void famousFor();
} 
	
class Manali extends Hillstations 
{
	void location()
	{
		System.out.println("Manali is in Himachal Pradesh.");
	}  
	void famousFor()
	{
		System.out.println("It is famous for beauty.");
	}  
}
class Mussoorie extends Hillstations 
{
	void location()
	{
		System.out.println("\nMussoorie is in Uttarakhand.");
	}  
	void famousFor()
	{
		System.out.println("It is famous for Lal Tibba Scenic Point.");
	}  
}
class Gulmarg extends Hillstations 
{
	void location()
	{
		System.out.println("\nGulmarg is in Jammu and Kashmir.");
	}  
	void famousFor()
	{
		System.out.println("It is famous for Tulip Garden.");
	}  
}
public class AbstractClass
{
	  public static void main(String args[])
	  {
		  Hillstations obj;
		  obj = new Manali();
		  obj.location();
		  obj.famousFor();
	  
		  obj = new Mussoorie();
		  obj.location();
		  obj.famousFor();
	  
		  obj = new Gulmarg();
		  obj.location();
		  obj.famousFor();
	  }
}