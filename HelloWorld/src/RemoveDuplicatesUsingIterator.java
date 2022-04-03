import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesUsingIterator {

	public static void main(String[] args) {
 
		List<String> l=new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("V");
		l.add("B");
		l.add("B");
		l.add("A");
		l.add("t");

		Collections.sort(l);
		Iterator<String> itr=l.iterator();
		String old=itr.next();

		while(itr.hasNext())
		{
			String next=itr.next();
			if(old.equals(next))
			{
				itr.remove();
			}
			old=next;
		}
		System.out.println(l);
	}

}
