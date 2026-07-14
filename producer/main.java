package producer;
     


class Producer implements Runnable{
   Factory factory;

   Producer(Factory factory) {
        this.factory = factory;
   }


   @Override
   public void run() {
    int x = 1;
    while (true) {
        factory.setData(x++);
    }
   }
}

class Factory implements Runnable{

}

class Consumer implements Runnable{
    Factory factory;

    Consumer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try(){
             
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class main {
    public static void main(String[] args) {

    }
}
