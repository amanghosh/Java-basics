package vehicle;

public class Vehicle {
	protected String regNumber,color,ownerName;
	protected int speed;
	
	Vehicle(String regno,String c,String owner,int sp){
		regNumber=regno;
		color=c;
		ownerName=owner;
		sp=speed;
	}
	public void showData() {
		System.out.println("This is a vehicle class");
	}
}