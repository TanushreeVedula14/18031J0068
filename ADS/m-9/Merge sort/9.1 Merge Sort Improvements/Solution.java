import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Merge
{
	int sortArray = 7;
	
	public void sort(int A[],int s,int e)
	{
		int m=0;
		if(e-s < sortArray)
		{
			int size = A.length;
			
			for(int i=0;i<size;i++)
			{
				int index = A[i];
				int j = 0;
				
				for(j=i-1;j>=0 && A[j]>index; j--)
				{
					A[j+1] = A[j];
				}
				A[j+1] = index;
			}
			System.out.println("Insertion sort method invoked...");
		}
		//if(s<e)
		else
		{
			m = (s+e)/2;
			
			sort(A,s,m);
			sort(A,m+1,e);
			merge(A,s,m,e);
			//System.out.println("Array is already sorted. So, skipped the call to merge...");
		}
		
		
	}
	
	public void merge(int A[],int s,int m,int e)
	{
		int left = m-s+1;
		int right = e-m;
		
		int L[] = new int[left];
		int R[] = new int[right];
		
		for(int i=0;i<left;i++)
		{
			L[i] = A[s+i];
		}
		for(int j=0;j<right;j++)
		{
			R[j] = A[m+1+j];
		}
		
		/*int size = A.length;
		
		for(int i=0;i<size;i++)
		{
			int index = A[i];
			int j = 0;
			
			for(j=i-1;j>=0 && A[j]>index; j--)
			{
				A[j+1] = A[j];
			}
			A[j+1] = index;
			//System.out.println(Arrays.toString(A));
		}*/
		
		/*int i=0;
		int j=0;
		int k=s;
		
		while(i<left && j<right)
		{
			if(L[i]<=R[j])
			{
				A[k] = L[i];
				i++;
			}
			else
			{
				A[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<left)
		{
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j<right)
		{
			A[k] = R[j];
			j++;
			k++;
		}*/
		
	}
	
	public void print(int A[])
	{
		int size = A.length;
		
		System.out.print("[");
		for(int i=0;i<size;i++)
		{
			if(i<A.length-1)
			{
				System.out.print(A[i]+", ");
			}
			else
			{
				System.out.print(A[i]);
			}
		}
		System.out.print("]");
	}
}
public class Solution 
{
	public static void main(String[] args) throws IOException 
	{
		Merge m = new Merge();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter numbers:");
		String str = br.readLine();
		String str1[] = str.split(",");
		int A[] = new int[str1.length];
		
		for(int i=0;i<str1.length;i++)
		{
			A[i] = Integer.parseInt(str1[i]);
		}
		
		m.sort(A, 0, A.length-1);
		m.print(A);
	}

}
