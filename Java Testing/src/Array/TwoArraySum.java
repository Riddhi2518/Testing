package Array;

import java.util.Scanner;

public class TwoArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int sumArr[] = new int[n];

        System.out.println("Enter " + n + " elements for first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + n + " elements for second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sumArr[i] = arr1[i] + arr2[i];
        }

        System.out.println("Sum of two arrays:");
        for (int i = 0; i < n; i++) {
            System.out.print(sumArr[i] + " ");
        }
	}

}
