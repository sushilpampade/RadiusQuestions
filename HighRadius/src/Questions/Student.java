package Questions;

import java.util.HashMap;

public class Student {

	String name;
	
	Student(String name)
	{
		this.name=name;
		
	}
	public String toString()
	{
		return name;
	}
	public int hashCode()
	{
		return 100;
	}
	
	public boolean equals(Object o)
	{
		try {
			
		String name=this.name;
		Student s=(Student)o;
		String name2=s.name;
		
		if(name.equals(name2))
		{
			return true;
		}
		else {
		return false;
		}
		}
		catch(ClassCastException e)
		{
			return false;
		}
		catch(NullPointerException e)
		{
			return false;
		}
	}

	public static void main(String[] args) {

		Student s=new Student("Sushil");
		Student s1=new Student("Sushil");
		Student s2=new Student("Sushil");

	HashMap<Student,Integer> h=new HashMap<>();
		
		h.put(s,1);
		h.put(s1,2);
		h.put(s2, 3);
		System.out.println(h);
		
		
	/*	System.out.println(s.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s.hashCode());

  */
		
	}

}
