class HashTable 
{
	int size;
	int maxSize;
	String[] keys;
	String[] vals;
	
	public HashTable(int s) 
	{
		size = 0;
		maxSize = s;
		keys = new String[maxSize];
		vals = new String[maxSize];
	}
	
	void makeEmpty()
    {
        size = 0;
        keys = new String[maxSize];
        vals = new String[maxSize];
    }
	
	int getSize()
	{
		return size;
	}
	
	boolean isFull()
	{
		return size == maxSize;
	}
	
	boolean isEmpty()
	{
		return getSize() == 0;
	}
	
	boolean contains(String key,String val)
	{
		return get(key,val) != null;
	}
	
	int hash(String key) 
    {
        return key.hashCode() % maxSize;
    } 
	
	void insert(String key, String val) 
    {                
        int temp = hash(key);
        int i = temp;
        //do
       // while(i != temp)
        //{
            if (keys[i] == null)
            {
                keys[i] = key;
                //System.out.println(keys[i]);
                vals[i] = val;
               // System.out.println(vals[i]);
                size++;
            }
            if (keys[i].equals(key)) 
            { 
                vals[i] = val; 
            }            
            i = (i+1) % maxSize; 
            //System.out.println("i = "+i);
        //} //while (i != temp);       
    }
	
	String get(String key,String val) 
    {
        int i = hash(key);
        while (keys[i] != null)
        {
            if (keys[i].equals(key))
            {
                return vals[i];
            }
            i = (i + 1) % maxSize;
        }            
        return null;
    }
	
	void printHashTable()
    {
        System.out.println("\nHash Table: ");
        for (int i = 0; i < maxSize; i++)
        {
            if (keys[i] != null)
            {
                System.out.println(keys[i] +" "+ vals[i]);
            }
        }
        System.out.println();
    }   
}
