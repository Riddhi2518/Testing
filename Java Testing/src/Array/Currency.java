package Array;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cur[]= {500,200,100,50,20,10};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter amount you want: ");
		int am=sc.nextInt();
		
		for(int i=0; i<cur.length; i++) {
			
		    if (am >= cur[i]) {
                int count = am / cur[i];      
                am= am % cur[i];         
                System.out.println(cur[i] + " x " + count);
            }
			
		}
	}

}
