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

        int x;
        public void setData(int x) {
            this.x = x;
            System.out.println("Produced: " + x);
        }

        public void getData() {
            System.out.println("Consumed: " + x);
        }

}

class Consumer implements Runnable{
    Factory factory;

    Consumer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        try(){
             getData();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class main {
    public static void main(String[] args) {

    }
}
