package twentysixthjune;

import java.util.Scanner;
import java.util.*;
public class Duckme {
    public static void main(String[] args) throws Exception {

        System.out.println("Main method excecution started");
        divide();
        System.out.println("Main method excecution completed");
    }


    static void divide() {
        System.out.println("Division started");
         Scanner var0 = new Scanner(System.in);
         System.out.println("Enter a :");
         int var1 = var0.nextInt();
         System.out.println("Enter b:");
         int var2 = var0.nextInt();
         int var3 = var1 / var2;
         System.out.println(var3);
    }
}




