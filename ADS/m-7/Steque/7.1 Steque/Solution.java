import java.util.Scanner;

class Steque
{
	Node front;
	Node rear;
	int size;
	
	class Node
	{
		String data;
		Node next;
		
		Node(String d, Node n)
		{
			data = d;
			next = n;
		}

	}
	
	Steque() 
	{
		front = null;
		rear = null;
		size = 0;
	}
	
	int size() 
    {
        return size;
    }
    
    boolean isEmpty()
    {
        return front==null;
    }

	public void push(String data)
	{
		Node n = new Node (data, null);
		
        if (front == null)
        {
        	front = n;
        	front.next = null;
        	rear = n;
        }
        else
        {
            n.next = front;
            front = n;
        }
        
        //System.out.println("\nPush:"+data);
        size++;
		
	}
	
	public void enqueue(String data)
	{
		Node n = new Node(data, null);
		
		if(rear == null)
		{
			front = n;
			rear = n;
		}
		
		rear.next = n;
		rear = n;
		
		//System.out.println("Enqueue:"+data);
		size++;
	}
	
	public void pop()
	{
		if(front != null)
		{
			Node n =front;
			front = front.next;
			//System.out.println("pop:"+n.data);
			size--;
			//return n.data;
		}
	}
	
	public String print() 
    {
		//System.out.println("Print");
		 if (size != 0) 
	     {
	        String str = "";
	        Node temp = front;
	        while (temp != null) 
	        {
	           str += temp.data + ", ";
	           temp = temp.next;
	        }
	        
	        System.out.print("\n");
	        return str.substring(0,str.length()-2);
	     }
	     return "";
     }
	
}
public class Solution 
{

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			
			//System.out.println("No. of operations:");
	        int n=sc.nextInt();
	          
	        String str = sc.nextLine();
	        
	        Steque sq=new Steque();
	        
	        while(str != null)
	        {
	        	String input[] = sc.nextLine().split(" ");
	            switch (input[0]) 
	            {
	            	case "push":	sq.push(input[1]);
	            					System.out.println(sq.print());
	            					break;
	            	case "enqueue":	sq.enqueue(input[1]);
	            					System.out.println(sq.print());
	            					break;
	            	case "pop":		if(!sq.isEmpty())
	            					{
	            						sq.pop();
	            						System.out.print(sq.print());
	            					}
	            					else
	            					{
	            						System.out.println("Steque is empty.");
	            					}
	            					break;
	            	default:
	            					break;

	            }
	        }
	        sc.close();
	}
}
