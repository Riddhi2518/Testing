package oop;

class Studentdetail{
	
	int id;
	String name,course;
	
   Studentdetail(int a, String b, String c){
	   
	   id=a;
	   name=b;
	   course=c;
	   
	   System.out.println("Student's Roll no.: "+a+", Name: "+b+", Course: "+c);
	 
   }
}


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentdetail s1= new Studentdetail(1,"Riddhi","QA tester");
		Studentdetail s2= new Studentdetail(2,"Shreya","Java");
		Studentdetail s3= new Studentdetail(3,"Khushi","C++");
		
	}

}
