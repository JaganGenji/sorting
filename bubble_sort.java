package sorting;

import java.util.Arrays;

public class bubble_sort {
	public static void main(String[] args) {
		
	
	int a[]= {5,4,3,2,-21,-8};
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
		
			}
		}
	}
	System.out.println(Arrays.toString(a));

}
}
