package multithread;

public class Thread4 extends Thread 
{
	public Thread4(String name)
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
		Thread4 t1 = new Thread4("Thread-1");  //new state
		Thread4 t2 = new Thread4("Thread-2");  //new state
		Thread4 t3 = new Thread4("Thread-3");  //new state
		Thread4 t4 = new Thread4("Thread-4");
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t4.setPriority(7);
		
		t1.start();  //runnable state  //running  //the start() method internally calls the run() method here.
		t2.start();
		t3.start();
		t4.start();
	}
}

//first thread : Thread-0
//second thread : Thread