package Assignment;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				
				count= i+j;
				if(count % 2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
