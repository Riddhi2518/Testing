package Encapsulations;


class Studentdetail{
	
	private int id[];
	private String name[],course[];
	
    public int[] getId() {
		return id;
	}
	public void setId(int[] id) {
		this.id = id;
	}

	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}



Studentdetail(int a[], String b[], String c[]){
	   
	   id=a;
	   name=b;
	   course=c;
	   
	   for(int i=0; i< id.length; i++) {
	   
	   System.out.println("Student's Roll no.: "+a[i]+", Name: "+b[i]+", Course: "+c[i]);
	   
	   }
	 
   }

}

public class StudentArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id[]= {1,2,3};
		String name[]= {"Riddhi","Shnehal","Avani"};
		String course[]= {"Java","C++","Python"};
		
		Studentdetail s1=new Studentdetail(id,name,course);
//		s1.setId(id);
//		s1.setName(name);
//		s1.setCourse(course);
		
//		  s1.setId(new int[]{4, 5, 6});
//        s1.setName(new String[]{"Meera", "Nidhi", "Pooja"});
//        s1.setCourse(new String[]{"Python", "React", "SQL"});
//
//		 Access new data using getters
//        System.out.println("\nUpdated Student Data:");
//        int[] newId = s1.getId();
//        String[] newName = s1.getName();
//        String[] newCourse = s1.getCourse();
//
//        for (int i = 0; i < newId.length; i++) {
//            System.out.println("Student's Roll no.: " + newId[i] + ", Name: " + newName[i] + ", Course: " + newCourse[i]);
//        }

	
	}
}
