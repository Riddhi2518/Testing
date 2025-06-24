package Conditional;

public class ForOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for(int i=1; i<=20; i++){
			if(i%2 != 0) {
				sum += i;
				System.out.println("Odd Number is: "+i);
			}	
		}
		System.out.println("Total of odd number till 20 is: "+sum);
//		int a=1;
//		
//		for(int i=1; i<=1; i++){ //outer row
//			
//
//			for(int j=a; j<=i; j++){ //inner column
//				//System.out.print( " i= "+i+"  j= " +j);
//				System.out.print(i);
//	         	}
//			
//			System.out.println( );
//         	}
//		
		
	}

}
