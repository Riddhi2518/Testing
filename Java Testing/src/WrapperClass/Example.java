package WrapperClass;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Converting int primitive data type to Integer Class object

		int a=20;
		
		Integer i=Integer.valueOf(a); //in old version of java that time we do this manually int to Integer Converting
		
		Integer j=a;//autoboxing , now complier will Integer.valueOf(a) internally ->in latest just we do auto boxing they do upper line automatically run 
	
		System.out.println(a+" "+i+" "+j);
		
		
		//Converting String to integer through wrapper class
		
		String str="20";
		int num=Integer.parseInt(str); //convert string to integer
		System.out.println(num*2);
	}

}
