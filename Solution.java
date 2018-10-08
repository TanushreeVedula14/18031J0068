
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> ll = new LinkedList<String>();
		
		//System.out.println("Enter string:");
		String line = br.readLine();
		
		//System.out.println("Enter string1:");
		String line1 = br.readLine();

		ll.add(line);
		ll.add(line1);
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.addAll(ll);
		ll1.addAll(ll);
		
		//System.out.println("Linked List:");
		for(String ll2:ll)
		{
			System.out.println(ll2);
		}

		
	}

}
