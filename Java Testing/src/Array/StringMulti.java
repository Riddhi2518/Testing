package Array;

import java.util.Scanner;

public class StringMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ar[]= {"Riddhi","Shnehal","Avani"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter string: ");	
		
		//String search="Avani";
		int flag=0;
		for(int i=0; i<ar.length; i++) {

           String search=sc.next();
			
			if(ar[i].equals(search)) {
			
			  flag=1;
			}

		}
		if(flag==1) {
			System.out.println("Match");
		}
		else {
			System.out.println("not Match");
		}
	}

}
