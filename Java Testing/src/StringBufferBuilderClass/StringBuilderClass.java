package StringBufferBuilderClass;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBulider class is mutable & non synchronized method it is faster then buffer class
		//append
		StringBuilder sb=new StringBuilder("Hello "); 
		sb.append("java"); //now original string is changed
		System.out.println(sb);//prints hello java
		
		//insert
		StringBuilder sb1=new StringBuilder("Hello ");
		sb1.insert(1, "java");//now original string is changed(offest:1 means index 1 se wo text instert hoga)
		System.out.println(sb1);//prints Hjavaello
		
		//replace
		StringBuilder sb2=new StringBuilder("Hello ");
		sb2.replace(1, 3, "java");//now original string relpaced with given other text(start index 1 to index 2 cz end:3 it is exclusive means not count that index)
		System.out.println(sb2);//prints Hjavalo
		
		//delete
		StringBuilder sb3=new StringBuilder("Hello ");
		sb3.delete(1, 3);//now original string is deletes charcter that mentons index 1 to 3 but 3 is exclusive index so, only 1&2 index deleted from "Hello" word
		System.out.println(sb3);//prints Hlo
		
		//reverse
		StringBuilder sb4=new StringBuilder("Hello ");
		sb4.reverse(); 
		System.out.println(sb4);//prints olleH
		
		//capacity
		StringBuilder sb5=new StringBuilder();
		System.out.println(sb5.capacity());//default 16
		sb5.append("Hello"); 
		System.out.println(sb5.capacity());//now 16
		sb5.append("Java is my favourite language");
		System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
				
		//ensureCapacity
		StringBuilder sb6=new StringBuilder();
		System.out.println(sb6.capacity());//default 16
		sb5.append("Hello"); 
		System.out.println(sb6.capacity());//now 16
		sb5.append("Java is my favourite language");
		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb6.ensureCapacity(10);//minimumCapacity:10 now no change ->cz minimumcapacity < actualcapacity then no changes heppen
		System.out.println(sb6.capacity());//now 34 
		sb6.ensureCapacity(50);//minimumCapacity:50 [(34*2)+2] now change capacity ->cz minimumcapacity > actualcapacity then it apply formula (oldcapacity*2)+2 changes heppen
		System.out.println(sb6.capacity());//now 70
	}

}
