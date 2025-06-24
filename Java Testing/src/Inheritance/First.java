package Inheritance;

class calc{ //parent or base or super class

	void add(int a,int b) {
		System.out.println("Addition is: "+(a+b));
	}
	
}

class sci extends calc{ //child or direved or sub class
	
	void square(int a) {
		System.out.println("Square is: "+(a*a));
	}
}

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sci s=new sci();
		s.add(10,20);
		s.square(5);

	}

}
