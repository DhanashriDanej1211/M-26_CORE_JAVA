package com.cg.corejava;

public class ThreadDemo1 {

	public static void main(String[] args)
	{
		Thread3 obj3=new Thread3();
		Thread4 obj4=new Thread4();
		
		obj3.run();
		obj4.run();
	}

}

class Thread3 implements Runnable
{
	
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("Cube::"+(i*i*i));
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}

class Thread4 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1200);
				System.out.println("Thrice Number::"+(i*3));
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}