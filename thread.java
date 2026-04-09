//class A extends Thread {
     // public void run(){
         //     System.out.println("thread A is running");
     // }
//}


//class B extends Thread{
  //   public void run(){
    //         System.out.println("thread B is running");
  //   }
//}

class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}
//the synchronized will ensure that the increment method is handled by a single thread a time.

//schedular decides what runs in the core;
//thread priority
//try{ thread.sleep(1000);}catch(Exception e){e.printStackTrace();}//this is used to make the thread sleep for a certain amount of time and it throws an exception so we have to catch it
//class A extends Runnable
//used lamda syntax


public class thread {
    public static void main(String[] args) throws InterruptedException {
             Runnable r = () -> 
             {
                System.out.println("thread A is running");
             };

             Runnable r1 = () -> 
             {
                System.out.println("thread B is running");
             };

             Thread t1 = new Thread(r);
             Thread t2 = new Thread(r1);

                t1.start();
                t2.start();

                t1.join();
                t2.join();
    }
}
//runnable obj1 = new A();
//Thread t1 = new Thread(obj1);
//t1.start();