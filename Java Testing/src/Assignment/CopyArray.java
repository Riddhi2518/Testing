package Assignment;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		int b[]=new int[5];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 5 array elements: ");
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("First array Elements: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nSecond array Elements: ");
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}
}
