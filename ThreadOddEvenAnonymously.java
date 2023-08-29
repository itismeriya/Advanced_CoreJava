package multithread;
public class ThreadOddEvenAnonymously 
{
	public static void main(String[] args)
	{
		new Thread()
		{
			public void run()
			{
				for(int i=1; i<=10; i=i+2)
				{
					try
					{
						Thread.sleep(400);
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
					System.out.println("Odd : "+Thread.currentThread().getName()+" :"+i);
				}
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				for(int i=0; i<=10; i=i+2)
				{
					try
					{
						Thread.sleep(400);
					}
					catch(InterruptedException e)
					{
						System.out.println(e);
					}
					System.out.println("Even : "+Thread.currentThread().getName()+" :"+i);
				}
			}
		}.start();
	}
}