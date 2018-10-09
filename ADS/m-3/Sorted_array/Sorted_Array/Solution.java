
	import java.io.*;

	public class Solution {

		public static void main(String[] args)throws Exception {
			// TODO Auto-generated method stub
	     int[] A=null;
	     int[] B=null;
	     int n,m;
	    
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     //System.out.println("Enter number of elements in first array");
	    String s1=br.readLine();
	     //System.out.println("Enter number of elements in second array");
	     String s2=br.readLine();
	     n=Integer.parseInt(s1);
	     m=Integer.parseInt(s2);
	    // System.out.println("enter array elements");
	String w1[]=null;
	String w2[]=null;

	     A=new int[n];
	     B=new int[m];
	String s=br.readLine();
	//System.out.println(s);
	String s3=br.readLine();
	//System.out.println(s3);
	w1=s.split("[,.]");
	w2=s3.split("[,.]");



	     for(int i=0;i<n;i++)
	     {
	    	 //System.out.println("a["+i+"]");
	    	 
	    	 A[i]=Integer.parseInt(w1[i]);
	    	 
	     }
	     for(int j=0;j<m;j++)
	     {
	    	// System.out.println("b["+j+"]");
	    	 //String s=sc.next();
	    	 B[j]=Integer.parseInt(w2[j]);
	     }
	     int[] C;
	     int i=0,j=0,k=0;
	     C=new int[m+n];
	     while(i<A.length&&j<B.length)
	     {
		   if(A[i]>B[j])
		   {
			   C[k]=B[j];
			   k++;
			   j++;
		   }
		   else
		   {
			   C[k]=A[i];
			   k++;
			   i++;
		   }
	      }
	     while(i<A.length)
	     {
	    	 C[k]=A[i];
	    	 k++;
	    	 i++;
	     }
	     while(j<B.length)
	     {
	    	 c[k]=b[j];
	    	 k++;
	    	 j++;
	     }
	     //System.out.println("after sorting");
	     for(k=0;k<C.length;k++)
	     {
	         if(k<C.length-1)
	    	 System.out.print(C[k]+",");
	         else
	       System.out.print(C[k]);
	     }

		}

	}



