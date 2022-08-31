package vehicle;

 class Bus extends Vehicle{
	 private int routeNumber;
		 Bus(String regno,String c,String owner,int sp,int route){ 
			 
			 super(regno,c,owner,sp);
			 routeNumber=route;
		}
		
		 public void showData(){
			super.showData();
			System.out.println("Reg no:"+regNumber);
			System.out.println("color:"+color);
			System.out.println("Owner:"+ownerName);
			System.out.println("Speed:"+speed);
			System.out.println("Route:"+routeNumber);
}}