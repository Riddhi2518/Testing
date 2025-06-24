package Polymorphism;

class RBI{
	
	void rateOfInterest() {
		System.out.println("RBI Created this method");
	}
}

class SBI extends RBI{
	
	void rateOfInterest() {
		System.out.println("SBI Gave 5% Interest");
	}
}

class PNB extends RBI{
	
	void rateOfInterest() {
		System.out.println("PNB Gave 7% Interest");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PNB pnb=new PNB();
		pnb.rateOfInterest();
		
		SBI sbi=new SBI();
		sbi.rateOfInterest();
	}
}
