package multithread;

public class Thread1 extends Thread 
{
	public Thread1(String name)
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
		Thread1 t1 = new Thread1("Thread-1");  //new state
		Thread1 t2 = new Thread1("Thread-2");  //new state
		t1.start();  //runnable state  //the start() method internally calls the run() method here.
		t2.start();  //runnable state  //the start() method internally calls the run() method here.
		//t1.start();
	}
}

//first thread : Thread-0
//second thread : Thread-1