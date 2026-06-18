import java.util.HashSet;
import java.util.Objects;

class Student extends Object {
   @Override
    public boolean equals(Object obj) {
       
            Student s = (Student) obj;
           if(this.rollNo == s.rollNo && this.name == s.name) {
               return true;
           
        } else {
        return false;
    }
    }
   
    @Override
    public int hashCode() {
         return Objects.hash(rollNo, name);
    }
   
    @Override
    public String toString() {
        return rollNo + " " + name;
    }
    int rollNo;
    String name;


    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
    }
}




public class sixteenjune {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(1, "John");
        Student s3 = new Student(2, "Jane");
        

        HashSet hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);



        System.out.println(hs);



      //s1.display();
      //s2.display();
      //s3.display();


      //System.out.println(s1.equals(s3));
      //System.out.println(s2.equals(s2));//now it doesnt see the address and compare but see the content as we have overriden the mehtod specific to student from the object class.



    }
}
