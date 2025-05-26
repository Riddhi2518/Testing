package Conditional;

public class Equalsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		String s4=new String("Hello");
		
//		if(s1==s2) {
//			System.out.println("Refrence match");
//		}
//		System.out.println(s3);
		
		if(s4.equalsIgnoreCase(s3)) {
			System.out.println("Refrence match");
		}
		else {
			System.out.println("Value not match");
		}
		
	}

}
