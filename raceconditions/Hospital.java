package raceconditions;

public class Hospital implements Runnable {

    String res1 = "bed";
    String res2 = "doctor";


    @Override
    Synchronized public void run() {
        String threadname = Thread.currentThread().getName();

        if (threadname.equals("Tom")) {
                tomTreatment();
        } else if (threadname.equals("Jerry")) {
                jerryTreatment();
        }
    }
    
}


void tomTreatment() {
    try {
        synchronized (res1) {
            System.out.println("Tom has " + res1);
            Thread.sleep(1000);
            synchronized (res2) {
                System.out.println("Tom has " + res2);
            }
        } 

    } catch (Exception e){
        e.printStackTrace(); 

    }
}

void jerryTreatment() {
    try {
        synchronized (res1) {
            System.out.println("Jerry has " + res1);
            Thread.sleep(1000);
            synchronized (res2) {
                System.out.println("Jerry has " + res2);
        }

    }
        } catch (Exception e) {
            e.printStackTrace();
 }


public class Main {
    public static void main(String[] args) {
        Hospital h = new Hospital();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);

        t1.setName("Tom");
        t2.setName("Jerry");

        t1.start();
        t2.start();
    }
}