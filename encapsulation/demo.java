package encapsulation;



class Human{
    private String name;
    private int age;

     /////PUBLIC METHODS/////

    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    } 

     
}
public class demo {
    public static void main(String[] args){
        Human h = new Human();
        h.setAge(22);
       

            System.out.println(h.getAge());
    }
}


