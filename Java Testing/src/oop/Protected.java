package oop;


class Test3{
	
	protected int x;
	public int y;
	
	
}

class Test4 extends Test1{
	void show() {
		System.out.println(x);
	}
}
public class Protected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 obj=new Test3();
		
		obj.x=20;
		System.out.println(obj.x);
 }

}
