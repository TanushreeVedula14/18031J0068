import java.util.Arrays;
import java.util.Scanner;

class MergeArray 
{ 
    int mergeArray(int A[], int B[], int m, int n) 
    { 
    	int C[] = new int[m+n];
    	
    	Arrays.sort(A);
    	/*System.out.println("Sorted A[]:\n");
    	for(int k=0;k<m;k++)
    	{
    		System.out.print(A[k]+" ");
    	}*/
    	
    	Arrays.sort(B);
    	/*System.out.println("\nSorted B[]:\n");
    	for(int l=0;l<n;l++)
    	{
    		System.out.print(B[l]+" ");
    	}*/
    	
    	int i = 0;
    	int j = 0;
      
    	//System.out.println("\nMerged Array:\n");
    	while (i<m && j<n) 
    	{ 
    		if (A[i] < B[j]) 
    		{
    			//System.out.print(A[i]+" ");
    			C[i] = A[i];
    			System.out.print(C[i]+",");
    			i++;
    		}
    		else if(B[j] < A[i]) 
    		{
    			//System.out.print(B[j]+" ");
    			C[j] = B[j];
    			System.out.print(C[j]+",");
    			j++;
    		}
    		else
    		{ 
    			//System.out.print(B[j]+" "); 
    			C[j] = B[j];
    			System.out.print(C[j]+",");
    			j++;
    			i++; 
    		} 
      } 
      while(i < m) 
      {
    	  //System.out.print(A[i]+" ");
    	  C[i] = A[i];
    	  System.out.print(C[i]+",");
    	  i++;
      }
      while(j < n) 
      {
    	  //System.out.print(B[j]+" ");
    	  C[j] = B[j];
    	  System.out.print(","+C[j]+"");
    	  j++;
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
