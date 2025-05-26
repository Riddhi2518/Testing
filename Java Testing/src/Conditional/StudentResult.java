package Conditional;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Java language marks: ");
		int m1=sc.nextInt();
		
		System.out.print("Enter your Softskills marks: ");
		int m2=sc.nextInt();
		
	    System.out.print("Enter your Selenium marks: ");
	    int m3=sc.nextInt();
	    
	    if(m1>40 && m2>40 && m3>40 ) {
	    	
	    	int total=m1+m2+m3;
	    	double percentage=total/3.0;
	    	String grade;
	    	
	    	if(percentage >= 80) {
	    		grade ="A";
	    	}else if(percentage >= 60) {
	    		grade ="B";
	    	}else if(percentage >= 50) {
	    		grade ="C";
	    	}else {
	    		grade ="D";
	    	}
	    	
	    	System.out.println("Your are pass in all three subject");
	    	System.out.println("Total Marks is: "+total);
	    	System.out.println("Percentage is: "+percentage);
	    	System.out.println("Grade is: "+grade);
	    }else {
	    	System.out.println("You are Fail");
	    }

	}

}
