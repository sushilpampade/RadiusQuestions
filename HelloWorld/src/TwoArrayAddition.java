
public class TwoArrayAddition {

	public static void main(String[] args) {
     int [] a= {1,2,3,8,4};
      int [] b= {4,5,6,5,4};
     int [] c=new int[a.length];
     for(int i=0;i<a.length;i++)
     {
    		  c[i]=a[i]+b[i];

     }
     for(int x:c)
     {
    	 System.out.println(x);
     }
	}
}