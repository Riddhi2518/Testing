package Static;

class A{
	
	static int i;
	A(){
		i++;
	}
	void counter(){
		System.out.println("Object count is: "+ i);
	}
}
public class ObjectCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		A a1=new A();
		A a2=new A();
		A a3=new A();
		
		a.counter();
	}

}
