package twentyninethjune;
//There are 26 rulles of thhe syntax of trowing ann exception in java especially in the case of
//inheritance and polymorphism. The rules are as follows:
//if the parent class does not throw exception the child will also now not trow exceptiom
//if the parent class throws exception the child class can throw the same exception or its subclass abe or mmayb not 
//if both doesnt throw an exception then the child class can throw unchecked exception


class Parennt {
      void display() {
        System.out.println("Parent class methhod");
      } 
}

class Child extends Parennt {
     void display() {
        System.out.println("Childd class mmethod");
     }

}
public class demo {
    public static void main(String[] args) {
        Child c = new Child();

        
    }
    
}
