package Exception;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		try {
			arr[5]=10;
			System.out.println("hello");
		}catch(ArithmeticException e){ //always first mention child class
			System.out.println("Error"+e);
		}catch(Exception e){ //always parent class is mention in last
			System.out.println("Error"+e);
		}
		System.out.println("Rest of the code..");
	}
}
