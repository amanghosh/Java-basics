package oops2;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area() {
		System.out.println("The area of Rectangle is"+ (length*breadth));
	}
	public void area(int length, int breadth) {
		System.out.println("The area of Rectangle is"+ (length*breadth));
	}
	public void perimeter() {
		System.out.println("The perimeter is"+ (2*(length+breadth)));
	}

}