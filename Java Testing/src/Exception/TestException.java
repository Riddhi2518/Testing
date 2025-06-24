package Exception;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int data=50/0;
			System.out.println("Hello: "+data);
		}catch(ArithmeticException e) {
			System.out.println("Error"+e);
		}
		System.out.println("Rest of the code...");
	}

//	 int a=10;
//	 int b=0;
//	 
// 
//	 System.out.println("division is "+(a/b));
//	 System.out.println("Hello ");
}
