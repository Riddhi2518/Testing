package Basic;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double P = 1000, R = 8, N = 2;
		double interest = (P * R * N) / 100;
		
		System.out.println("Amount: " + P);
		System.out.println("Interest Rate: " + R);
		System.out.println("No. of year: " + N);
		System.out.println("Simple Interest is: " + interest);
	}

}
