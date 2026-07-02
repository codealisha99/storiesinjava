package threading;

import java.util.Scanner;



class Addition extends Thread {
    
        int a, b;
    
        Addition(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public void run() {
            System.out.println("Addition activty started");
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();


            System.out.println("Addition: " + (a + b));
            System.out.println("Addition activity ended");
        }
}

class Print extends Thread {

    
     @Override
    public void run() {
        System.out.println("Printing activity started");

        for (int i = 0; i < 5; i++) {
            System.out.println("Printing: " + i);
        }
        System.out.println("Printing activity ended");
    }
}

public class demo {
    
  public static void main(String[] args) {
    Addition addition = new Addition(5, 10);

    Print print = new Print();

    addition.start();
    print.start();
}
}