import java.io.BufferedReader;

@FunctionalInterface
interface A{
    void show();
    void fly();
}

interface B extends A{
    void run();

}

class c implements B{
    public void show(){
        System.out.println("show");
    }
    public void fly(){
        System.out.println("fly");
    }
    public void run(){
        System.out.println("run");
    }
}

enum status{
    STARTED,
    IN_PROGRESS,
    COMPLETED
}




public class demoo {
    public static void main(String[] args){
        c obj = new B() {
            public void show(){
                System.out.println("show in the main");
            }
            public void fly(){
                System.out.println("fly in the main");
            }
            public void run(){
                System.out.println("run in the main");
            }
        }

        BufferedReader bf = new BufferedReader(null)
    }
}
