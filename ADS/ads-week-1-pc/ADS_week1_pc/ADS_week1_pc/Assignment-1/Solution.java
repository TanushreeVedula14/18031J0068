import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AddLinkedList
{
	Node head;
	
	class Node
	{
		Node next;
		int data;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void addNode(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	@SuppressWarnings({ "unused", "null" })
	Node addLargenumbers(Node n1, Node n2)
	{
		
		int carry = 0;
		int sum = 0;
		int iteration = 0;
		
		Node new_node1 = null;
		Node carryNode = null;
		
		while(n1 != null && n2 != null)
		{
			iteration++;
			if(n1 != null)
			{
				sum = sum + n1.data;
				n1 = n1.next;
			}
			if(n2 != null)
			{
				sum = sum + n2.data;
				n2 = n2.next;
			}
			
		}
		
		new_node1.data = sum;
		new_node1.next = new_node1;
		
		return new_node1;
		
	}
	public void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

}

class Solution 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.println("Enter string:");
		String line = br.readLine();
		int m = Integer.parseInt(line);
		
		AddLinkedList all = new AddLinkedList();
		all.addNode(m);
		all.display();
		
		//System.out.println("\n1st Node:");
		all.addNode(9);
		all.addNode(9);
		all.addNode(9);
		all.display();
		
		//System.out.println("\n2nd Node:");
		all.addNode(1);
		all.addNode(1);
		all.addNode(1);
		all.display();

	}

}
