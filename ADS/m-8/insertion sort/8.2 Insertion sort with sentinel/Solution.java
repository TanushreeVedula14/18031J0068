
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Selection
{
	public void sort(char A[])
	{
		int size = A.length;
		
		for(int i=0;i<size;i++)
		{
			int index = i;
			
			for(int j=i+1;j<size;j++)
			{
				if(A[j]<A[index])
				{
					index = j;
				}
			}
			
			char temp = A[index];
			A[index] = A[i];
			A[i] = temp;
			
			System.out.println(Arrays.toString(A));
		}
	}
	public void print(char A[])
	{
		int size = A.length;
		
		System.out.print("[");
		for(int i=0;i<A.length;i++)
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

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Selection sc = new Selection();
		
		String str = "";
		//System.out.println("Enter no. of operations:");
		int op = Integer.parseInt(br.readLine());
		int count = 0;
		
		while(count<op)
		{
			//System.out.println("Enter sorting elements:");

			str = br.readLine();
			
				String[] str2 = str.split(" ");
				int k=0;
				char c1[]=new char[str2.length];
		
				for(int i=0;i<str2.length;i++)
				{
					//System.out.print(str2[i]);
					char c2[] = str2[i].toCharArray();
					c1[k++]=c2[0];
					//System.out.print(c1[i]);
				}
		
				sc.sort(c1);
				sc.print(c1);
			
			count++;
		}
	}

}
