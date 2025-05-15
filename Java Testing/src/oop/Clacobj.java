package oop;

class Calc1{
	
	int num1;
	int num2;
	
	void init_data(int a, int b) {
		num1=a;
		num2=b;
		
	}
	
	void sub() {
		System.out.println("Substraction is: "+(num1-num2));
	}
	void add() {
		System.out.println("Addition is: "+(num1+num2));
	}
	void mul() {
		System.out.println("Multiplication is: "+(num1*num2));
	}
	void div() {
		double div1=(double)num1/num2;
		System.out.println("Division is: "+div1);
		
	}
	
}


public class Clacobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc1 obj=new Calc1();
		obj.init_data(10,20);
		obj.sub();
		obj.add();
		obj.mul();
		obj.div();
	}

}
