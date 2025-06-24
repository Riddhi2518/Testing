package Assignment;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n=100;
        int sum=0;
        
        for(int i=1; i<=n; i++) {
        	
        	int count=0;
        	for(int j=1; j<=n; j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}
        	
        	if(count==2) {
        		sum +=i;
        	}	
        }
        System.out.println("1 to 100 Prime number sum is: "+sum);			
	}
}
