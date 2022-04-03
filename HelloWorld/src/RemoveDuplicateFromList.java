import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("V");
		l.add("B");
		l.add("A");
		Set<String> s=new HashSet<>(l);
		List<String> l1=new ArrayList<>(s);
		for(Object  x:l1)
		System.out.println(x);
		
		
	}

}
