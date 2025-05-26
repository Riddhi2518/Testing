package oop;

import java.util.Scanner;

class Salary1{
	
	int eid;
	String name;
	double basicSalary;
	double netSalary;
	
	Salary1(int a, String b, double c){
		
		eid=a;
		name=b;
		basicSalary=c;
	}
	void calc()	{
		double DA = basicSalary*0.02;
		double HRA = basicSalary*0.03;
		double grosssalary = basicSalary + DA + HRA;
		double tax = grosssalary * 0.03;
		
		netSalary = grosssalary - tax;
		
	}
	
	void disp() {
		
		System.out.println("Empolyee's ID: " +eid+ ", Name: " + name + ", Basic Salary: " +basicSalary+ ", Net Salary: " + netSalary);
	}
}
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in); //implicit object & explicit object
		
		System.out.print("Enter Employee id: ");
		int sid=sc.nextInt();
		
		System.out.print("Enter Employee name: ");
		String sname=sc.next();
		
		System.out.print("Enter Employee BasicSalary: ");
		double sbasicSalary=sc.nextDouble();
		
		
		Salary1 s1=new Salary1(sid,sname,sbasicSalary);
//		s1.name=sname;
//		s1.eid=sid;
//		s1.basicSalary=sbasicSalary;
		
		
		s1.calc();
		s1.disp();
		
		
	}

}
