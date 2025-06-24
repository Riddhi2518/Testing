package Polymorphism;


class A{
	
	void add(int a,int b) {
		System.out.println("Two value: "+(a+b));
	}
	
	void add(int a,int b,int c) {
		System.out.println("Three value: "+(a+b+c));
	}
	
	void add(int a,int b,int c,int d) {
		System.out.println("Four value: "+(a+b+c+d));
	}
}
public class MethodOverloading {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			A obj=new A();
			obj.add(10, 20);
			obj.add(10, 20, 30);
			obj.add(10, 20, 30, 40);
		}
}
