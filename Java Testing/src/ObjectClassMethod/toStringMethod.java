package ObjectClassMethod;

import java.util.Objects;

class std{
	int rollno;
	String name;
	
	std(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public String toString() {
		return "std [rollno=" + rollno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		std other = (std) obj;
		return Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
}
public class toStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		std s1= new std(1,"Rushi");
		System.out.println(s1);
		
		std s2= new std(2, "riddhi");
		System.out.println(s2);
	}

}
