
public class Vehicle implements Bike{
	public String Vehicle_type;
	public int wheels;
	
	public void vehicleDetails(String Vehicle_type,int wheels) {
		
		this.Vehicle_type=Vehicle_type;
		this.wheels =wheels;
		System.out.println("Vehicle Type is : "+Vehicle_type +" Wheels: "+wheels);
		System.out.println("The vehicle is in good conndition");
		System.out.println("This vehicle can be purchased ");
	}
}
