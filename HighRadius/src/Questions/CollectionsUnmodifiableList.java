package Questions;

import java.util.*;  
public class CollectionsUnmodifiableList {  
    public static void main(String[] args) {  
          List<String> list = new ArrayList<>();  
        Collections.addAll(list, "Google", "Mozila FireFox", "Yahoo");  
        List<String> list2 = Collections.unmodifiableList(list);  
        System.out.println("Unmodifiable List: " + list2);  
        list.add("sushil");  
        System.out.print("Unmodifiable List after adding element to the list:");  
        System.out.println(list2);  
        }  
}  