package oop;

class cube{
	
	int num1; //instance variables
	
	
	void res(int a) {
		System.out.println("Cube is: "+(a*a*a));
	}
}


public class Cubeobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cube c1=new cube();
		c1.res(2);
	}

}
