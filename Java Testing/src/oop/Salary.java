package oop;

class Employee{
	
	int eId;
	String name;
	double basicsalary;
	double netSalary;
	
	Employee(int a, String b, double c){
	
		eId=a;
		name=b;
		basicsalary=c;
		
		double DA = c*0.02;
		double HRA = c*0.03;
		double grosssalary = c + DA + HRA;
		double tax = grosssalary * 0.03;
		 
		netSalary = grosssalary - tax;
	}
	
	void disp() {
		System.out.println("Empolyee's ID: " +eId+ ", Name: " + name + ", Basic Salary: " +basicsalary+ ", Net Salary: " + netSalary);
	}
}
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1= new Employee(1, "Riddhi",50000);
		Employee e2= new Employee(2, "Shrusti",60000);
		Employee e3= new Employee(3, "Bansi",70000);
		
		e1.disp();
		e2.disp();
		e3.disp();
	}

}
