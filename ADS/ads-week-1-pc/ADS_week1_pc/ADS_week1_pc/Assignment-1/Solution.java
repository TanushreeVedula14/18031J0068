import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AddLinkedList
{
	Node head;
	
	class Node
	{
		Node next;
		long data;
		int size;
		
		Node(long d)
		{
			data = d;
			next = null;
			size = 0;
		}
		
		
	}
	
	Node numberToDigits(String number)
	{
		
			long m = Integer.parseInt(number);
			Node new_node = new Node(m);
			new_node.next = head;
			head = new_node;
		
		return head;
	}
	
	public void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		
	}

}
class Solution 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		AddLinkedList all = new AddLinkedList();
		
		System.out.println("Enter string:");
		String line = br.readLine();
		
		System.out.println("Enter string1:");
		String line1 = br.readLine();
		
		
		
		all.numberToDigits(line1);
		all.numberToDigits(line);
		
		all.display();
		
	}

}
