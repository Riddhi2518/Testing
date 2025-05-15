package oop;

class Interest{
	
	int p,r,n;
	
	void simpleint(int p1, int r1, int n1) {
		int i1 = (p1*r1*n1) / 100;
		System.out.println("Simple interest is: "+i1);
	}
}


public class Interestobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interest i1=new Interest();
		i1.simpleint(1000, 8, 2);
	}

}
