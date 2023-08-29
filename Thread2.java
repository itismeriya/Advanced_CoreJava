package multithread;

public class Thread2 extends Thread 
{
	public Thread2(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Thread : "+Thread.currentThread().getName()+" :"+i);
		}
	}
		
	
	public static void main(String[] args)
	{
		Thread2 t1 = new Thread2("Thread-1");  //new state
		Thread2 t2 = new Thread2("Thread-2");  //new state
		Thread2 t3 = new Thread2("Thread-3");  //new state
		t1.start();  //runnable state  //running  //the start() method internally calls the run() method here.
		
		try
		{
			t1.join();  //t2 and t3 will wait for this thread to die
		}
		
		catch(Exception e)
		{
			//TODO: handle exception
		}
		
		t2.start();
		t3.start();
	}
}

//first thread : Thread-0
//second thread : Thread-1