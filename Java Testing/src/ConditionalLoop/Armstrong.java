package ConditionalLoop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sn = n; //sn=stored number

        int sum = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            sum++;
        }

        int result = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, sum);
            temp /= 10;
        }

       
        if (result == sn) {
            System.out.println(sn + " is an Armstrong number");
        } else {
            System.out.println(sn + " is NOT an Armstrong number");
        }

	}

}
