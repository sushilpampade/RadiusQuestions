package Questions;
import java.util.*;
public class MyHashMap {

	public static void main(String[] args) {
    HashMap h=new HashMap();
    h.put(1,"Sushil");
    h.put(2,"Satish");
    h.put(3,"vijay");
    System.out.println(h);
     Set s=h.keySet();
     System.out.println(s);
     Collection c=h.values();
     System.out.println(c);
     Set s1=h.entrySet();
     System.out.println(s1);
     Iterator itr=s1.iterator();
     while(itr.hasNext())
     {
    	 Map.Entry m=(Map.Entry)itr.next();
    	// System.out.println(m.getKey()+"....."+m.getValue());
    	 if(m.getKey().equals(1))
    	 {
    		 m.setValue("my name is sushil");
    	 }
    	 System.out.println(m.getKey()+"->"+m.getValue());

     }
	}

}
