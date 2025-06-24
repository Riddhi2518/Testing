package Encapsulations;

class test{
	
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test t= new test();
		t.setA(10);
		System.out.println("A variable value is: "+t.getA());
		
		
		
	}

}
