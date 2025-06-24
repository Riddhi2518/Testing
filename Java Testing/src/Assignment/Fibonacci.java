package Assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2=1;
		int sum=0;
		
		System.out.print("Fibonacci Series is: "+n1+" "+n2);
		
		for(int i=0; i<10; i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum);  //1, 2
			n1=n2; //1
			n2=sum; //1
		}
	}

}
