package Static;

class Customer{
	String name;
	int cust_id;
	static int ri=3;
	
	Customer(String name, int cust_id){
		this.name=name;
		this.cust_id=cust_id;
	}
	
	void disp() {
		System.out.println("Name: "+name+" Customer id: "+cust_id+" Interest: "+ri);
	}
	
	static void change(int a) {
		ri=a;
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1=new Customer("Riddhi", 101);
		c1.disp();
		
		Customer c2=new Customer("Naina", 102);
		c2.disp();
		
		Customer.change(5); //static method value change
		
		Customer c3=new Customer("Komal", 103);
		c3.disp();
	}

}
