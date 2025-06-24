package Abstract;

abstract class Parent{
	abstract void message();
}

class sub1 extends Parent{
	void message() {
		System.out.println("This is First subclass");
	}
}

class sub2 extends Parent{
	void message() {
		System.out.println("This is Second subclass");
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sub1 s1=new sub1();
		sub2 s2=new sub2();
		
		s1.message();
		s2.message();
	}

}
