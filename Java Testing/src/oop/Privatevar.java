package oop;


class Test2{
	
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	void disp() {
		System.out.println("X " +x);
		System.out.println("Y "+y);
	}
}


public class Privatevar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 obj =new Test2();
		obj.setX(20); //setter method
		obj.setY(30);
		
		System.out.println(obj.getX()); //geeter method
		

		obj.disp();
	}

}
