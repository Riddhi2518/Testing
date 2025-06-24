package StringBufferBuilderClass;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*StringBuffer class is mutable it is "SYNCHRONIZED" method means first request come then take first after complinting that then take second request so it take more time
		   so ||StringBuffer is slower then StringBulider class || but 
		      ||StringBuffer is faster then String class || */
		
		
		//append
		StringBuffer sb=new StringBuffer("Hello "); 
		sb.append("java"); //now original string is changed
		System.out.println(sb);//prints hello java
		
		//insert
		StringBuffer sb1=new StringBuffer("Hello ");
		sb1.insert(1, "java");//now original string is changed(offest:1 means index 1 se wo text instert hoga)
		System.out.println(sb1);//prints Hjavaello
		
		//replace
		StringBuffer sb2=new StringBuffer("Hello ");
		sb2.replace(1, 3, "java");//now original string relpaced with given other text(start index 1 to index 2 cz end:3 it is exclusive means not count that index)
		System.out.println(sb2);//prints Hjavalo
		
		//delete
		StringBuffer sb3=new StringBuffer("Hello ");
		sb3.delete(1, 3);//now original string is deletes charcter that mentons index 1 to 3 but 3 is exclusive index so, only 1&2 index deleted from "Hello" word
		System.out.println(sb3);//prints Hlo
		
		//reverse
		StringBuffer sb4=new StringBuffer("Hello ");
		sb4.reverse(); 
		System.out.println(sb4);//prints olleH
		
		//capacity
		StringBuffer sb5=new StringBuffer();
		System.out.println(sb5.capacity());//default 16
		sb5.append("Hello"); 
		System.out.println(sb5.capacity());//now 16
		sb5.append("Java is my favourite language");
		System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
				
		//ensureCapacity
		StringBuffer sb6=new StringBuffer();
		System.out.println(sb6.capacity());//default 16
		sb5.append("Hello"); 
		System.out.println(sb6.capacity());//now 16
		sb5.append("Java is my favourite language");
		System.out.println(sb6.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb6.ensureCapacity(10);//minimumCapacity:10 now no change ->cz minimumcapacity < actualcapacity then no changes heppen
		System.out.println(sb6.capacity());//now 34 
		sb6.ensureCapacity(50);//minimumCapacity:50 [(34*2)+2] now change capacity ->cz minimumcapacity > actualcapacity then it apply formula (oldcapacity*2)+2 changes heppen
		System.out.println(sb6.capacity());//now 70
		
		//capacity storing values in string do by defalut by using string Buffer 
		//array have limitation like you want store only 5 index then 6 index can't accept so this is difference
	}

}
