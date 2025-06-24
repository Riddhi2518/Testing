package ObjectClassMethod;


public class hasCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="java";
		String s2="java";
		String s3=new String("java");
		
		System.out.println("Name of the class: "+s2.getClass());
		
		System.out.println("s1" +s1.hashCode());
		System.out.println("s2" +s2.hashCode());
		
		
		if(s1==s3) {
			System.out.println("String macthed");
		}else {
			System.out.println("String not matched");
		}
		
		if(s1.equals(s3)) {
			System.out.println("String matched");
		}
	}

}
