package oop;

class Test1{
	int y;
	String x;
	Test1(){
		System.out.println("default constructor method");
	}
	
	Test1(String a, int b){
		x=a;
		y=b;
		System.out.println("parameterised constructor "+a);
	}
	
	void disp() {
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}


public class ParameterisedCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t= new Test1("text",20);
		
		t.disp();

	}

}
