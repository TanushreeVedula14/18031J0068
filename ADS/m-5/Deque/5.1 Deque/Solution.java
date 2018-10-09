package com.m_5.doubleQueue;

import java.util.Scanner;

class DoubleQueue1 
{
	int A[];
	int rear;
	int front;
	int size;
	int length;
	
	public DoubleQueue1(int size) 
	{
		A = new int[size];
		rear = -1;
		front = -1;
		this.size = size;
		length = 0;
	}
	
	public boolean isFull()
	{
		return ((front == -1 && rear == size-1) || front == rear+1);
	}
	
	public boolean isEmpty()
	{
		return (front == -1 && rear == -1);
	}
	
	public int getSize()
	{
		return length;
	}
	
	public void insertFront(int ele) 
	{
		/*if(isFull())
		{
			System.err.println("Front overflow.");
		}
		else*/
		{
			if(front == -1)
			{
				front = 0;
				rear = 0;
			}
			else if(front == 0)
			{
				front = size-1;
			}
			else
			{
				front = front-1;
			}
		
			A[front] = ele;
			//System.out.print("["+ele+"]"+" ");
			length++;
		}
	}
	
	public void insertRear(int ele)
	{
		/*if(isFull())
		{
			System.err.println("Rear overflow.");
		}*/
		if(front == -1)
			{
				front = 0;
				rear = 0;
			}
			else if(rear == size-1)
			{
				rear = 0;
			}
			else
			{
				rear = rear+1;
			}
			A[rear] = ele;
			//System.out.print("["+ele+"]"+" ");
			length++;
			
		
	}
	
	public void deleteFront()
	{
		/*if(isEmpty())
		{
			System.err.println("No element to delete.");
		}*/
		if(front == rear)
		{
				front = -1;
				rear = -1;
			}
			else if(front == size-1)
			{
				front = 0;
			}
			else
			{
				front = front+1;
			}
			//B = new int[ele];
			length--;
		}
	
	
	public void deleteRear()
	{
		/*if(isEmpty())
		{
			System.err.println("Rear empty.");
		}*/
		if(front == rear)
		{
				front = -1;
				rear = -1;
			}
			else if(rear == 0)
			{
				rear = size-1;
			}
			else
			{
				rear = rear-1;
			}
			length--;
		}
	
	
	public int getFront()
	{
		if(isEmpty())
		{
			//System.out.println("Front empty.");
			return -1;
		}
		return A[front];
	}
	
	public int getRear()
	{
		if(isEmpty())
		{
			//System.out.println("Rear empty.");
			return -1;
		}
		return A[rear];
	}
	public void display()
    {
        //System.out.print("\nQueue: ");
       
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }    
}

class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter Queue Size:");
		int n = sc.nextInt();
		
		DoubleQueue1 dq = new DoubleQueue1(n);
		int ch=0;
		
		do {
			//System.out.println("\nQueue Operations:");
			//System.out.println("\n1.Insert Front.\n2.Insert Rear.\n3.Delete Front.\n4.Delete Rear.\n5.Size.\n6.Display.");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1: //System.out.println("Enter element in front:");
						int ele = sc.nextInt();
						dq.insertFront(ele);
						break;
				case 2: //System.out.println("Enter element in rear:");
						int ele1 = sc.nextInt();
						dq.insertRear(ele1);
						break;
				case 3: dq.deleteFront();
						break;
				case 4: dq.deleteRear();
						break;
				case 5: System.out.println(dq.getSize());
						break;
				case 6: dq.display();
						break;
			}
		}while(ch<7);
		sc.close();
	}
}
