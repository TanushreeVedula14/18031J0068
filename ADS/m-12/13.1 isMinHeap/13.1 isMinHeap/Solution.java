
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PriorityQueue
{
	double[] Heap;
	double size;
    double maxsize;
 
    private static final double FRONT = 1;
 
    PriorityQueue(double ms)
    {
        maxsize = ms;
        size = 0;
        Heap = new double[(int) (maxsize + 1)];
        Heap[0] = Double.MIN_VALUE;
    }
 
    double parent(double pos)
    {
        return pos / 2;
    }
 
    double leftChild(double pos)
    {
        return (2 * pos);
    }
 
    double rightChild(double pos)
    {
        return (2 * pos) + 1;
    }
 
    boolean isLeaf(double pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        { 
            return true;
        }
        return false;
    }
 
  /*  private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }*/
 
    void minHeapify(double pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[(int) pos] > Heap[(int) leftChild(pos)]  || Heap[(int) pos] > Heap[(int) rightChild(pos)])
            {
                if (Heap[(int) leftChild(pos)] < Heap[(int) rightChild(pos)])
                {
                    //swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }else
                {
                    //swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }
 
    void insert(double element)
    {
        Heap[(int) ++size] = element;
        double current = size;
 
        while (Heap[(int) current] < Heap[(int) parent(current)])
        {
            //swap(current,parent(current));
            current = (int) parent(current);
        }	
    }
 
    @SuppressWarnings("unused")
	boolean print()
    {
        for (double i = 0; i <= size/2; i++ )
        {
        	if(size == 1)
        	{
        		System.out.println(true);
        		return true;
        	}
        	else if(Heap[(int) i] < Heap[(int) ((2*i)+1)] && Heap[(int) i] < Heap[(int) ((2*i)+2)] || 
        			Heap[(int) i] == Heap[(int) ((2 * i)+1)] && Heap[(int) i] == Heap[(int) ((2 * i)+2)])
        	{
        		//System.out.println(Heap[(int) i]);
        		System.out.println(true);
        		return true;
        	}
        	else
        		//System.out.println(Heap[(int) i]);
        		System.out.println(false);
        		return false;
        }
		return false; 
    }
 
    void minHeap()
    {
        for (double pos = (size / 2); pos >= 1 ; pos--)
        {
            minHeapify(pos);
        }
    }
 
    double remove()
    {
        double popped = Heap[(int) FRONT];
        Heap[(int) FRONT] = Heap[(int) size--]; 
        minHeapify(FRONT);
        return popped;
    }
 
}

public class Solution 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue pq;
		
		//System.out.println("Enter Data Type:");
		String str = br.readLine();
		
		switch(str)
		{
			case "String"   : //System.out.println("Enter no. of inputs:");
			 				  int inputs = Integer.parseInt(br.readLine());
			 				
			 				  //System.out.println("Enter input:");
			 				
			 				  int flag = 0;
			 				  while(flag < inputs)
			 				  {
			 					  String inp = br.readLine();
			 					  int c;
			 					  char[] ascii;
			 					
			 					  while(inp.length() > 0)
			 					  {
			 						pq = new PriorityQueue(inp.length());
			 						String[] inp1 = inp.split(",");
			 						String chars;
			 						for(int i = 0;i < inp1.length;i++)
			 						{
			 							chars = inp1[i].substring(0, 1);
			 							c = chars.charAt(0);
			 							System.out.print(c+" ");
			 							pq.insert(c);
			 						}
			 						pq.minHeap();
			 						pq.print();
			 						break;
			 					  }
			 					  flag++;
			 					  /*if((inp=br.readLine()) != null)
		 		    			 	  continue;
		 		    			  else
		 		    			 	  break;*/
			 				  }
			 				  break;
			case "Integer" 	: //System.out.println("No. of inputs:");
							  inputs = Integer.parseInt(br.readLine());
							   
							  int ele;
							  flag = 0;
							  //System.out.println("Enter input:");
				 				
			 				  while(flag < inputs)
			 				  {
			 					  String inp = br.readLine();
			 					
			 					  while(inp.length() > 0)
			 					  {
			 						 String[] inp1 = inp.split(",");
			 						 pq = new PriorityQueue(inp.length());
			 						 for(int i = 0;i < inp1.length;i++)
			 						 {
			 							//System.out.println(i);
			 							ele = Integer.parseInt(inp1[i]);
			 							pq.insert(ele);
			 						 }
			 						pq.minHeap();
			 						pq.print();
			 						break;
			 					  }
			 					  flag++;
			 					/* if((inp=br.readLine()) != null)
		 		    			 	  continue;
		 		    			  else
		 		    			 	  break;*/
			 				  }
			 				  break;
			case "Double"   : //System.out.println("No. of inputs:");
			  				  inputs = Integer.parseInt(br.readLine());
			  				  
			  				  double ele1 = 0;
			  				  flag = 0;
			  				  
							  //System.out.println("Enter input:");
							  while(flag < inputs)
							  {
								  String inp = br.readLine();
								  
								  while(inp.length() > 0)
								  {
									  String[] inp1 = inp.split(",");
									  pq = new PriorityQueue(inp.length());
									  for(int i = 0;i < inp1.length;i++)
									  {
										  ele1 = Double.parseDouble(inp1[i]);
										  pq.insert(ele1);
									  }
									  pq.minHeap();
									  pq.print();
									  break;
								  }
								  flag++;
							  }
							  break;
			case "Float"  :   //System.out.println("No. of inputs:");
			  				  inputs = Integer.parseInt(br.readLine());
				  
			  				  float ele2 = 0;
			  				  flag = 0;
			  
			  				  //System.out.println("Enter input:");
			  				  while(flag < inputs)
			  				  {
			  					  String inp = br.readLine();
				  
			  					  while(inp.length() > 0)
			  					  {
			  						  String[] inp1 = inp.split(",");
			  						  pq = new PriorityQueue(inp.length());
			  						  for(int i = 0;i < inp1.length;i++)
			  						  {
			  							  ele2 = Float.parseFloat(inp1[i]);
			  							  pq.insert(ele2);
			  						  }
			  						  pq.minHeap();
			  						  pq.print();
			  						  break;
			  					  }
			  					  flag++;
			  				  }
			  				  break;
		}
		
		
		
	}

}
