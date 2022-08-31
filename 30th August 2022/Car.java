package vehicle;

public class Car extends Vehicle{
	
	private String manufacturerName;
	Car(String regno,String c,String owner,int sp,String m){ 
		
		super(regno,c,owner,sp);
		
		manufacturerName=m;
	}
	public void showData(){
		
		super.showData();
		System.out.println("Reg no:"+regNumber);
		System.out.println("color:"+color);
		System.out.println("Owner:"+ownerName);
		System.out.println("Speed:"+speed);
		System.out.println("Manufacturer:"+manufacturerName);
	
	}
}