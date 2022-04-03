
public class BinarySearch {

	public static void main(String[] args) {

		int []a = {1,3,4,6,7,9};
		int search=6;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			
		if(a[mi]==search)
		{
			System.out.println("Element found at position "+mi);
			break;
		}
		else if(a[mi]<search)
		{
			li=mi+1;
		}
		else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
	}
		if(li>hi)
	System.out.println("Element not found");
	}
	
}