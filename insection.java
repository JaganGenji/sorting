package sorting;

import java.util.Arrays;

public class insection {

	public static void main(String[] args) {
    int a[]= {6,4,5,3,2,1};
    int n=a.length;
    for(int i=0;i<n;i++)
    {
    	int key=a[i];
    	int j=i-1;
    	while(j>=0&& key<a[j])
    	{
    		a[j+1]=a[j];
    		j--;
    	}
    	a[j+1]=key;
    	
    }
    System.out.println(Arrays.toString(a));
    
	}

}
