
	import java.io.*;

	public class Solution {

		public static void main(String[] args)throws Exception {
			// TODO Auto-generated method stub
	     int[] a=null;
	     int[] b=null;
	     int n,m;
	    
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     //System.out.println("enter number of elements in first array");
	    String s1=br.readLine();
	     //System.out.println("enter number of elements in second array");
	     String s2=br.readLine();
	     n=Integer.parseInt(s1);
	     m=Integer.parseInt(s2);
	    // System.out.println("enter array elements");
	String w1[]=null;
	String w2[]=null;

	     a=new int[n];
	     b=new int[m];
	String s=br.readLine();
	//System.out.println(s);
	String s3=br.readLine();
	//System.out.println(s3);
	w1=s.split("[,.]");
	w2=s3.split("[,.]");



	     for(int i=0;i<n;i++)
	     {
	    	 //System.out.println("a["+i+"]");
	    	 
	    	 a[i]=Integer.parseInt(w1[i]);
	    	 
	     }
	     for(int j=0;j<m;j++)
	     {
	    	// System.out.println("b["+j+"]");
	    	 //String s=sc.next();
	    	 b[j]=Integer.parseInt(w2[j]);
	     }
	     int[] c;
	     int i=0,j=0,k=0;
	     c=new int[m+n];
	     while(i<a.length&&j<b.length)
	     {
		   if(a[i]>b[j])
		   {
			   c[k]=b[j];
			   k++;
			   j++;
		   }
		   else
		   {
			   c[k]=a[i];
			   k++;
			   i++;
		   }
	      }
	     while(i<a.length)
	     {
	    	 c[k]=a[i];
	    	 k++;
	    	 i++;
	     }
	     while(j<b.length)
	     {
	    	 c[k]=b[j];
	    	 k++;
	    	 j++;
	     }
	     //System.out.println("after sorting");
	     for(k=0;k<c.length;k++)
	     {
	         if(k<c.length-1)
	    	 System.out.print(c[k]+",");
	         else
	       System.out.print(c[k]);
	     }

		}

	}



