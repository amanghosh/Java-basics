package oops2;

class Square extends Rectangle{
	
		 
	int side;
	
	Square(int side){
			   super(side,side);
			   this.side=side;
	}
	
	public int getAreaSq() {
		return this.side * this.side;
	}
		   
}