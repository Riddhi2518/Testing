package Assignment;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=4;
		
		for(int i=1; i<=length; i++) {
			
			for(int j=length-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
