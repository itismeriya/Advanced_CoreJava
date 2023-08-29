package multithread;

class ThreadOdd extends Thread 
{
//	public ThreadOdd(String name)
//	{
//		super(name);
//	}
	
	public void run()
	{
		for(int i=1;i<=10;i=i+2)
		{
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Odd Thread : "+Thread.currentThread().getName()+" :"+i);
		}
	}
}

class ThreadEven extends Thread 
{
//	public ThreadEven(String name)
//	{
//		super(name);
//	}
	
	public void run()
	{
		for(int i=0;i<=10;i=i+2)
		{
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Even Thread : "+Thread.currentThread().getName()+" :"+i);
		}
	}
}

public class ThreadOddEven
{
	public static void main(String[] args)
	{
		ThreadOdd t1 = new ThreadOdd();
		ThreadEven t2 = new ThreadEven();
		t1.start();
		t2.start();
	}
}