package ConditionalLoop;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=1; i<=5; i++){ //outer row
//
//			for(int j=1; j<=5; j++){ //inner column
//				
//				System.out.println( " i= "+i+"  j= " +j);
//	         }
//		}
		
//		for(int i=1; i<=5; i++){ //outer row
//
//			for(int j=1; j<=5; j++){ //inner column
//				
//				System.out.print(j);
//	         }
//			System.out.println();
//		}		

//		for(int i=1; i<=5; i++){ //outer row
//
//			for(int j=1; j<=5; j++){ //inner column
//				
//				System.out.print(i);
//	         }
//			System.out.println();
//		}
		
//		for(int i=1; i<=5; i++){ //outer row
//
//			for(int j=1; j<=i; j++){ //inner column
//				
//				System.out.print(i);
//	         }
//			System.out.println();
//		}

		for(int i=5; i>=1; i--){ //outer row

			for(int j=1; j<=i; j++){ //inner column
				
				System.out.print(j);
	         }
			System.out.println();
		}
		
	}

}
