package Array;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
//		int a[]=new int[5];
//		int sum=0;
//		Scanner sc=new Scanner(System.in);
//		for(int i=0; i<a.length; i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int i=0; i<a.length; i++) {
//			sum +=a[i];
//		}
//		double avarage=sum/5.0;
//		
		outer:
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= 3; j++) {
		        if (j == 2) {
		            break outer; // breaks the outer loop
		        }
		        System.out.println(i + " " + j);
		    }
		}
		
	}

}
