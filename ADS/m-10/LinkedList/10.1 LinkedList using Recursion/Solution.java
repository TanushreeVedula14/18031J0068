import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	Node(int a)
	{
		this.data=a;
		this.next=null;
	}
}
class LinkedList
{
	int size=0;
	Node head;
	
	LinkedList()
	{
		head = null;
	}
	
	void insertAt1(int pos,int data,int c)
	{
	
		Node n = new Node(data);
		int count=c;
	
		if(pos > size+1 || pos < 0)
		{
			System.out.println("Can't insert at this position.");
		}
		else if(head == null)
		{
			head = n;
		}
		else if(pos == 0)
		{
			n.next = head;
			head = n;
		}
		else
		{	
			Node temp = head;
			
			while(count+1 != pos)
			{
				temp = temp.next;
				count++;
			}
	
			n.next = temp.next;
			temp.next = n;
		}
		size++;
	}
	
	void insertAt(int pos,int data,int c)
	{
	
		Node n = new Node(data);
		int count = c;
	
		if(pos > size+1 || pos < 0)
		{
			System.out.println("Can't insert at this position.");
		}
		else if(head == null)
		{
			head = n;
		}
		else if(pos == 0)
		{
			n.next = head;
			head = n;
			size++;
		}
		else
		{	
			Node temp = head;
			insert(temp,pos,data,count,n);
		}
	}
	
	void insert(Node temp,int pos,int data,int count,Node n)
	{
		if(temp != null && count < pos-1)
		{
			temp = temp.next;
			count++;
			insert(temp,pos,data,count,n);
		}
		else
		{
			n.next = temp.next;
			temp.next = n;
			size++;
		}
	}
	
	int reverseNode()
	{
		size--;
		if(head == null)
		{
			return 0;
		}
		else if(head.next == null)
		{
			int data = head.data;
			head = null;
			return data;
		}
		else
		{
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			int data = temp.next.data;
			temp.next = null;
			return data;
		}

	}
	
	void reverse(int pos)
	{
		if(head == null)
		{
			System.out.println("No elements to reverse.");
		}
		else
		{
			int i = pos;
			
			if(i != size)
			{
				int data = reverseNode();
				insertAt(i,data,0);
				i++;
				reverse(i);
			}
		}
	}
	
	String print()
	{
		Node temp = head;
		String s = "";
		if(temp == null)
		{
			return null;
		}
		else
		{
			while(temp.next != null)
			{
				System.out.print(temp.data+", ");
				temp = temp.next;
			}
		}
		System.out.println(temp.data);
		return s;
	}
}

class Solution
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList ll = new LinkedList();
		
		while(sc.hasNext())
		{
			String s = sc.nextLine();
			String[]b = s.split(" ");
			String key = b[0];
			
			switch(key)
			{
				case "insertAt":
										ll.insertAt(Integer.parseInt(b[1]),Integer.parseInt(b[2]),0);
										if(Integer.parseInt(b[1])>=0&&Integer.parseInt(b[1])<=ll.size)
										{
											ll.print();
										}
										break;
				case "reverse":
										ll.reverse(0);
										ll.print();
										break;
				
			}
			
		}
	}
}
