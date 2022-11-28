package com.cg.corejava;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException
	{
		Yashwant obj1=new Yashwant();
		obj1.start();
		obj1.join(3000,50);
		for(int i=0;i<10;i++)
		{
			System.out.println("i am Rahul..");
		}
	}

}

class Yashwant extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am Yashwant..");
		}
		try
		{
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}