package Super;

class stud{
	stud(){
		System.out.println("Paren constructor");
	}
	stud(int a){
		System.out.println("Parent Parmeter");
	}
}

class sub extends stud{
	sub(){
		//super(10);
		System.out.println("Child constructor");
	}
	sub(int a){
		super(a);
		System.out.println("Child parameter");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sub s=new sub(10);
	}

}
