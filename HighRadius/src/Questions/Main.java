package Questions;


import java.util.*;
 class Employee implements Comparable{
	String name;
	int age;
	int salary;
	
	Employee(String name,int age,int salary)
{
	this.name=name;
	this.age=age;
	this.salary=salary;
}
 public String toString()
 {
	 return name+".."+age+"..."+salary;
 }
 public int compareTo(Object obj)
 {
	 int age=this.age;
	 Employee e=(Employee)obj;
	 int age2=e.age;
	 if(age<age2)
	 {
		 return -1;
	 }
	 else if(age>age2)
	 {
		 return +1;
	 }
	 else 
		 return 0;
 }
}
public class Main
{
	public static void main(String[] args) {
	    	TreeSet t=new TreeSet(new MyComparator());

	Employee e=new Employee("satish",3,6000);
	Employee e1=new Employee("sushil",2,7800);
	Employee e2=new Employee("vijay",1,1800);
	Employee e3=new Employee("pooja",7,1300);
	
	t.add(e); 	t.add(e1);	t.add(e2);	t.add(e3);
   System.out.println(t);
	}
}
class MyComparator implements Comparator {
    public int compare(Object o1,Object o2)
    {
        Employee e=(Employee)o1;
        Employee e1=(Employee)o2;
        int salary1=e.salary;
        int salary2=e1.salary;
        if(salary1<salary2){
            return -1;
        }
        else if(salary1>salary2){
            return +1;
        }
        else
        return 0;
        }
        }
    
    