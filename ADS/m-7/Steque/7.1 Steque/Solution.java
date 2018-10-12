import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        return size==0;
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
        size++;
		
	}
	
	public void enqueue(String data)
	{
		Node n = new Node(data, null);
		
		if(rear == null||front==null)
		{
			front = n;
			rear = n;
			size++;
			return;
		}
		
		rear.next = n;
		rear = n;
		
		size++;
	}
	
	public void pop()
	{
		if(size != 0)
		{
			Node n =front;
			front = front.next;
			//n.data = null;
			//n.next = null;
			size--;
		}
	}
	
	public String print() 
    {
		//System.out.println(size);
		 if (size != 0) 
	     {
	        String str = "";
	        Node temp = front;
	        while (temp != null) 
	        {
	           str = str + temp.data + ", ";
	           temp = temp.next;
	        }
	        //System.out.println(str);
	        
	        return str.substring(0,str.length()-2);
	     }
		 else
		 {
	     return "Steque is empty.";
		 }
     }
	
}
public class Solution 
{

	public static void main(String[] args) throws IOException
	{
			//System.out.println("No. of operations:");
	       
	       String str="";
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int n=Integer.parseInt(br.readLine());
	      
	    	 while(n>0)  
	    	 {
	    		 str=br.readLine(); 
	    		 Steque sq=new Steque();
	    		 System.out.println();
	    		 while(str.length()>0)
	    		 {
	    			 String input[]=str.split(" ");
	    			 switch (input[0]) 
	    			 {
	    			 	case "push":	sq.push(input[1]);
	            						System.out.println(sq.print());
	            						break;
	    			 	case "enqueue":	sq.enqueue(input[1]);
	            						System.out.println(sq.print());
	            						break;
	    			 	case "pop":		if(sq.size != 0)
	            						{
	            							sq.pop();
	            							System.out.println(sq.print());
	            						}
	            						else
	            						{
	            							System.out.print("Steque is empty.\n");
	            						}
	            						break;
	    			 }
	    			 if((str=br.readLine()) != null)
	    			 	continue;
	    			 else
	    			 	break;	
	    	}
	    		 n--;
	    	 }
	}
}
