package twentysixthjune;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        System.out.println("Main method excecution started");
        divide();
        System.out.println("Main method execution completed");
    }





    static void divide() {
        try {
               System.out.println("Division started");
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter a:");
               int a = sc.nextInt();
               Syste.out.pritnln("Enter b:");
               int b = sc.nextInt();
               int c = a/b;
               System.out.println(c);
        }
        catch (exception e) {
              System.out.println("Exception handled in divide method");

              Sytsem.out.println("Division completed");
        }
    }
}
