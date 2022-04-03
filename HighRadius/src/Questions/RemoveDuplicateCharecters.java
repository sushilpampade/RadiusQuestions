package Questions;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharecters {

	public static void main(String[] args) {

		String s="aabbccdd";
		char [] ch=s.toCharArray();
		Set<Character> set=new LinkedHashSet<>();
		for(char x:ch) {
			set.add(x);
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb.toString());
	}

}
