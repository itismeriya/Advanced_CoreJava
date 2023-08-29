package multithread;



public class ThreadDemo extends Thread {
public void run()
{
	for(int i=0;i<=5;i++)
	{
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	System.out.println("THREAD="+Thread.currentThread().getName());
}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		t1.start();
		t2.start();
	}

}
