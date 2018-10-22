import java.util.Arrays;
import java.util.Scanner;

class Insert
{
	public void sort(int A[])
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
			System.out.println(Arrays.toString(A));
		}
	}
	
	public void print(int A[])
	{
		int size = A.length;
		
		System.out.println("Array after sorting:");
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
public class Insertion 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Insert in = new Insert();
		
		System.out.println("Enter size of an array:");
		int size = sc.nextInt();
		
		int A[] = new int[size];
		System.out.println("Enter elements in array:");
		for(int i=0;i<size;i++)
		{
			A[i] = sc.nextInt();
		}
		
		in.sort(A);
		in.print(A);
	}

}
