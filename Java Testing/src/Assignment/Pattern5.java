package Assignment;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length=3;
		
		for(int i=1; i<=length; i++) {
			
			for(int j=1; j<=length-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=length-1; i>=1; i--) {
			
			for(int j=1; j<=length-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
