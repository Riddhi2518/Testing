package Array;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int j=0; j<5; j++) {
			System.out.print("Enter number "+j+" : ");
			a[j]=sc.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}

	}

}
