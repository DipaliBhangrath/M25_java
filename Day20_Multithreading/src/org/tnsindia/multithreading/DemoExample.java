package org.tnsindia.multithreading;

class A extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
}

public class DemoExample {
	public static void main(String[] args)
	{
		A obj=new A();
		obj.start();
		obj.start();

	}

}
