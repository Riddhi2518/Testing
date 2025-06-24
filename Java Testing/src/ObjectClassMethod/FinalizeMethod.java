package ObjectClassMethod;

class st{
	int rollno;
	String name;
	
	stdcfstgfhhhhhhhhhh(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public void finalize() {
		System.out.println("finalize method invoke ");
	}
}
public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		st s= new st(1,"java");
		System.out.println(s.hashCode());
		
		s=null;
		System.gc();
		
		System.out.println("Hello");

	}

}
