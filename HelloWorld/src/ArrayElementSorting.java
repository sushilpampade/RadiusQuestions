import java.util.Arrays;
import java.util.Comparator;

public class ArrayElementSorting {

	public static void main(String[] args) {

		int a1[]= {1,34,42,2,44,4,56,5};
		Integer [] a=new Integer[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			a[i]=Integer.valueOf(a1[i]);
		}
		Arrays.sort(a);
		System.out.println("Arrays in Asending order");
		for(Integer x:a)
		System.out.print(x+" ");

		Arrays.sort(a,new MyComparator());
		System.out.println("Arrays in Desending order");
		for(Integer x:a)
		System.out.print(x+" ");

	}
	}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return -1;
	}
}
