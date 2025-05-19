package oop;

class Test{
	int a;
	
	//constructor 
	Test(){
		System.out.println("Constructor method");
		a=10;
	}
	
	void disp() {
		System.out.println("Disp function invoked " +a);
	}
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t=new Test();
		t.disp();
	}

}
