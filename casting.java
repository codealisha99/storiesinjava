class A {
    void show() {
        System.out.println("In A");
    }

}
class B extends A {
     void show1() {
        System.out.println("In B");
}
}

public class casting {
    public static void main(String[] args){
        A obj = new A();
        obj.show(); // normal methods

        A obj1 =  new B();
        obj1.show(); // error because of upcasting

        B obj2 =  (B) obj1;
        obj2.show1(); // downcasting 
    }
}
