package Array;

public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      int ar[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
//		for(int i=0; i<3; i++) {
//			
//			for(int j=0; j<3; j++) {
//				
//				System.out.print(ar[i][j]+" ");
//			
//			}
//			System.out.println();
//		}
		
//      int mul[][]= {{10,20,30},{40,50,60},{70,80,90}};
//		
//		for(int i=0; i<3; i++) {
//			
//			for(int j=0; j<3; j++) {
//				System.out.print(mul[i][j]*5+" ");
//			}
//			System.out.println();
//		}
		
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a.length; j++) {
				if(i==j) {
				System.out.print(a[i][j]+" ");
			 }
			
			}
			System.out.println();
		}
		
	}

}
