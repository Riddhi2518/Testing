package Abstract;

abstract class abc{
	
	void disp() {
		System.out.println("Disp");
	}
	
	abstract void show();
}

class def extends abc{
	
	void show() {
		System.out.println("Overriden method");
	}
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		def a=new def();
		a.disp();
		a.show();
	}

}
