package Exception;

class MyException extends Exception{
	
	void show() {
		System.out.println("Exception avyu");
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			MyException e1=new MyException();
			throw e1;
		}catch(MyException e) {
			e.show();
		}
		
		System.out.println("Rest of code...");
	}

}
