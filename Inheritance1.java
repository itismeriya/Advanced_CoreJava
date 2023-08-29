package OOPS;

class Hotel
{
	int hotelId;
	String HotelName;
	float roomFare;
	
	void setData(int hotelId, String HotelName, float roomFare)
	{
		this.hotelId = hotelId;
		this.HotelName = HotelName;
		this.roomFare = roomFare;
	}
	void display()
	{
		System.out.println("Hotel Id : "+this.hotelId+"\nHotel Name : "+this.HotelName+"\nHotel Room Fare : "+this.roomFare);
	}
}
class GrandHotel extends Hotel
{
	
}
public class Inheritance1
{
	public static void main(String args[])
	{
		GrandHotel h = new GrandHotel();
		h.setData(101,"Tamarind",2000.45f);
		h.display();
	}
}