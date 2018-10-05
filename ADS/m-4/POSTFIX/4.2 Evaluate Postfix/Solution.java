import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution 
{
    public static int postfixEvaluate(String exp) 
    {
	 	Stack<Integer> s = new Stack<Integer> ();
		Scanner tokens = new Scanner(exp);
		
		while (tokens.hasNext()) 
		{
			if (tokens.hasNextInt()) 
			{
				s.push(tokens.nextInt());
			} 
			else 
			{
				int num2 = s.pop();
				int num1 = s.pop();
				String op = tokens.next();
				
				if (op.equals("+")) 
				{
					s.push(num1 + num2);
				} 
				else if (op.equals("-")) 
				{
					s.push(num1 - num2);
				} 
				else if (op.equals("*")) 
				{
					s.push(num1 * num2);
				} else
				{
					s.push(num1 / num2);
				}
			}
		}
		return s.pop();
    }
    public static void main(String[] args) throws IOException 
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String exp = br.readLine();
        System.out.println(postfixEvaluate(exp));               
    }
}