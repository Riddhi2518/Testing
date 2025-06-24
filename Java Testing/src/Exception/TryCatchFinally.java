package Exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		int data=25/0;
		System.out.println(data);
	}catch(ArithmeticException e) {
		System.out.println(e);	
	}finally {
		System.out.println("always executes!");
	}
	}

}
