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






public class demoo {
    public static void main(String[] args){
        c obj = new B(){
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
    }
}
