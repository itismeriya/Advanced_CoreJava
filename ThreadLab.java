package multithread;

class AverageThread extends Thread {
    
    public void run() {
        synchronized (this) {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            double average = (double) sum / 10;
            System.out.println("Average of the first 10 numbers: " + average);
            notify();
        }
    }
}
class SquareThread extends Thread {
    
    public void run() {
        synchronized (this) {
           int[] arr = {1, 20, 50, 15, 30};
           System.out.println("Square of numbers:");
            for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i]*arr[i]+" ");
            }
            notify();
        }
    }
}

    public class ThreadLab{
    public static void main(String[] args)  {
        
        
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {}
        t2.start();
      
    }
}
