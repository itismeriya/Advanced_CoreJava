package OOPS;
////one parent class have many child class
//
//class Bank{
//float rateOfInterest(){
//	return 8.0f;
//}
//}
//class Sbi extends Bank{
//@Override
//float rateOfInterest(){
//	return 6.56f;
//}
//}
////class Axis extends Sbi{
//@Override
//float rateOfInterest(){
//	return 9.2f;
//}
//}
//everyone use rateofinterest method but with different percentage
//1.WE can override / run time polymorphism(where we can override only method)
//2.abstract method
//run time polymorphism/(where we can override only method)
//where childclass can use parentclass method but with different method
//1.Is-a relationship means inheritance
//2.same method 
//3.parameter list same

//why java does not support hybrid and multiple inheritance

//2.abstract method
//public class HiearchialInheritance {
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	Bank b;
//	b=new Sbi();
//	System.out.println(b.rateOfInterest());
//	b=new Axis();
//	System.out.println(b.rateOfInterest());
////	Sbi s=new Sbi();
////	System.out.println(s.rateOfInterest());
//	
//
//}
//
//}