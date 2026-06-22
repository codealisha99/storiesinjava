package twentytwojune;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

 class Student {
   int rollno;
   String name;
   int marks;


   Student(int rollno, String name, int marks) {
       this.rollno = rollno;
       this.name = name;
       this.marks = marks;
   }

   @Override
    public String toString() {
         return rollno + " " + name + " " + marks;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John", 85);
        Student s2 = new Student(2, "Jane", 90);
        Student s3 = new Student(3, "Doe", 80);
        Student s4 = new Student(1, "John", 85); // Duplicate roll number

        HashMap<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(s1.rollno, s1);
        studentMap.put(s2.rollno, s2);
        studentMap.put(s3.rollno, s3);
        studentMap.put(s4.rollno, s4); // This will overwrite the previous entry with roll number 1


        System.out.println("Keys:");
       Set res1 = studentMap.keySet();
       Iterator itr1 = res1.iterator();
       while(itr1.hasNext()) {
           System.out.println(itr1.next());
       }

        
       
       System.out.println("Values:");
       /*  Set res2 = studentMap.entrySet();
        Iterator itr2 = res2.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        */

        Collection res2 = studentMap.values();
        Iterator itr2 = res2.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("Key - Values Pairs:");

        Set res3 = studentMap.entrySet();
        Iterator itr3 = res3.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    }
}
