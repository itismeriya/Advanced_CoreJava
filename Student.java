//Program on Constructor Overloading


package overloading;

public class Student 
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("Default Constructor.");
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("Parameterized Constructor.");
	}
	
	public static void main(String[] args) 
	{
		Student s = new Student();
		System.out.println("Student id : "+s.id+"\nStudent name : "+s.name);
		
		Student s1 = new Student(101,"Deesha");
		System.out.println("Student id : "+s1.id+"\nStudent name : "+s1.name);
	}
}