

abstract class aeroplane{
          abstract public void show();
}

class aero extends aeroplane{
        public void show(){
                System.out.println("aero");
        }
}

//abstract method only have abstract classes and u cant make a direct object of it u have to make anothr class which extends it or make an anonymous class to run it 




public class poly {
    public static void main(String[] args){
           aeroplane a = new aeroplane(){
                public void show(){
                        System.out.println("aeroplane in the poly");//this is an anonymous class which is used to create an object of an abstract class and we can also override the method of the abstract class in the anonymous class
                }
           };
           a.show();
    }
}
