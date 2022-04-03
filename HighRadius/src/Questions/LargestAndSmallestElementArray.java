package Questions;

import java.util.Arrays;

public class LargestAndSmallestElementArray {
	
	public static void main(String[] args) {

		int[] x= {3,6,2,7,2,7,8,1,88,4};
		Arrays.sort(x);
		int max=x[0];
		int min=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
			if(x[i]<min)
			{
				min=x[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

	}

}
