package ConditionalLoop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int reversed = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;          
            reversed = reversed * 10 + digit; 
            temp /= 10;                    
        }

        System.out.println("Reversed number: " + reversed);


	}

}
