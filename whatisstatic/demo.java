class Mobile{ //1)I have declared a class now i have to make an object if i have to use it.
    String Brand;//instance varaible
    int Model;
    String network;
    static String name = "sam";//universal to all classes


    public void show(){
        System.out.println(Brand + " : " + Model + name);
    }
}

public class demo {
    public static void main(String[] args){
         Mobile m = new Mobile();//2)made an object 
         m.Brand = "Apple";
         m.Model = 123;
         m.network = "local";
         Mobile.name = "sam";



         Mobile m1 = new Mobile();//3)made another object 
         m1.Brand = "Applebanana";
         m1.Model = 12345;
         m1.network = "ddlocal";
         Mobile.name = "lemon";


         m.show();
         m1.show();


    }
}
