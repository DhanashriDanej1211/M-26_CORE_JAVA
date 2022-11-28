package com.cg.corejava;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread1 obj1=new Thread1();
		Thread2 obj2=new Thread2();
		
		obj1.run();
		obj2.run();

	}

}

class Thread1 extends Thread
{
	public void  run()
	{
		
		try 
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("Square Number"+(i*i));
			} 
		}catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
			
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1500);
				System.out.println("Double Number"+(i*2));
			}
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	
	}
}