import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node
{
    int data;
    Node next;
    
    public Node(int x)
    {
        data=x;
        next=null;
    }
}
class Queuemain
{
	Node front=null,rear=null;
    public boolean isEmpty()
    {
        if (front==null || rear==null)
            return true;
        else
            return false;
    }
    public void enqueue(int x)
    {
        if (isEmpty()==true)
        {
        	Node p=new Node (x);
            front=rear=p;
        }
        else
        {
        	Node p=new Node (x);
            rear.next=p;
            rear=p;
        }
    }
    public int dequeue()
    {
        if(isEmpty()==true)
        {
           // System.out.println("Queue is Empty");
            return 0;
        }
        else
        {
            int x=front.data;
            front=front.next;
            return x;
        }
    }
    public int peek()
    {
        if(isEmpty()==true)
        {
            //System.out.println("Queue is Empty");
            return 0;
        }
        else
        {
            return(front.data);
        }
    }
   /* public void display()
    {
        if(isEmpty()==true)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
        	Node temp=front;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }*/
}
public class Solution 
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queuemain q = new Queuemain();
		
		int j = 0;
		
		//System.out.println("Enter inputs:");
		int input = Integer.parseInt(br.readLine());
		
		while(j <= input)
		{
			//System.out.println("\nEnter m:");
			//String m = br.readLine();
			int m = Integer.parseInt(br.readLine());
			//String w1[] = m.split(" ");
			
			for(int i=0;i<m;i++)
			{
				q.enqueue(i);
			}
		
			//System.out.println("\nEnter n:");
			int n = Integer.parseInt(br.readLine());
			while(!q.isEmpty())
			{
				for(int i=0;i<n-1;i++)
				{
					q.enqueue(q.dequeue());
					System.out.print(q.dequeue()+" ");
				}
			}
		}
		
		
	}

}
