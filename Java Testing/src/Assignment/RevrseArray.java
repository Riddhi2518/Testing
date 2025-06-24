package Assignment;

import java.util.Scanner;

public class RevrseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 array elements: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Array Elements: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nArray Reverse Elements: ");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}

	}
}
