package ConditionalLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sn = n;
        int reversed = 0;
      

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        if (sn == reversed) {
            System.out.println(sn + " is a Palindrome.");
        } else {
            System.out.println(sn + " is NOT a Palindrome.");
        }
	}

}
