package Assignment;

import java.util.Scanner;

public class ConcateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any string: ");
		String a= sc.nextLine();
		
		String con = a.concat(" How are you?");
		System.out.println(con);
	}

}
