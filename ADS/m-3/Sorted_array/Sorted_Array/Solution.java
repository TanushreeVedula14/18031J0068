import java.util.Arrays;
import java.util.Scanner;

class MergeArray 
{ 
    int mergeArray(int A[], int B[], int m, int n) 
    { 
    	int C[] = new int[m+n];
    	
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	int i = 0;
    	int j = 0;
    	int k = 0;
      
    	while (i < m && j < n) 
    	{ 
    		C[k++] = A[i++]; 
	        C[k++] = B[j++]; 
	    } 
    	while (i < m) 
            C[k++] = A[i++]; 
    	
    	while (j < n) 
            C[k++] = B[j++]; 
    	
    	for(k=0;k<(m+n);k++)
    	{
    		if(k<(m+n-1))
    		System.out.print(C[k]+",");
    		else
    			System.out.println(C[k]);
    	}
    	
      return 0;
             
    } 
} 
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter A[] size:");
		int m =sc.nextInt();
		int A[] = new int[m];
		//System.out.println("Enter A[] elements:");
		for(int i=0;i<m;i++)
		{
			A[i] = sc.nextInt();
		}
		
		//System.out.println("Enter B[] size:");
		int n = sc.nextInt();
		int B[] = new int[n];
		//System.out.println("Enter B[] elements:");
		for(int i=0;i<n;i++)
		{
			B[i] = sc.nextInt();
		}
		
		MergeArray ma = new MergeArray();
		ma.mergeArray(A,B, m, n);
	}

}
