import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution 
{
	public static void main(String[] args) throws IOException 
	{
		//Scanner sc = new Scanner(System.in);
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter size");
        int size = Integer.parseInt(br.readLine());
        HashTable ht = new HashTable(size);
        int count = 0;
        //System.out.println("Insert data:");
        
        while(count < size)
        {
        	String data = br.readLine();
        	String[] data1 = data.split(",");
        	ht.insert(data1[0],data1[1]);
        	count++;
        }
        
        //System.out.println("How many records you want ?");
        int key = Integer.parseInt(br.readLine());
        int flag = 0;
        do
        {
        	//System.out.println("Enter get:");
        	String data2 = br.readLine();
        	String[] data3 = data2.split(" ");
        	switch(data3[0])
        	{
        		case "get" : System.out.println(ht.get(data3[1],data3[2]));
        						break;
        	}
        	flag++;
        }while(flag<key);
        

	}

}
