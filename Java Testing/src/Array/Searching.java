package Array;

import java.util.Scanner;

public class Searching {

	public static String searchNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return "Number found in the array.";
            }
        }
        return "Number not found in the array.";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter number to search: ");
        int toFind = scanner.nextInt();

        String result = searchNumber(numbers, toFind);
        System.out.println(result);
	}

}
