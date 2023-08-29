package multithread;


import java.util.*;
public class OddEven extends Thread {
	
    public void run() {
    	Random random=new Random();
    	
    	for(int i=0;i<=5;i++)
    	{
    		try {
    			Thread.sleep(400);
    		}catch(InterruptedException e) {
    			System.out.println(e);
    		}
    		 int num =random.nextInt(1,200);
    		 num=num*2;
    		 if(num %2==0) {
    			 System.out.println(num+" is an even number :"+Thread.currentThread().getName()+": "+i);
    		 }
    		 else {
    			 System.out.println();
    		 }
    		 
    	}
    }
    
    public static void main(String[] args) {
		OddEven obj1=new OddEven();
		obj1.start();
	}
}
