import java.util.*;

public class ManageLocal {

public static void main(String[] args) {

System.out.println("Main method execution started");
try{

divide();

   } 
catch (Exception e)

 {

System.out.println("Exception handled in main method.");

 }

System.out.println("Main method execution completed");

}

static void divide()

{

try

{

System.out.println("Division started");

Scanner scan = new Scanner(System.in);

System.out.println("Enter a :");

int a = scan.nextInt();

System.out.println("Enter b:");

int b = scan.nextInt();

int c = a/b;

System.out.println(c);

}

catch (Exception e)

{

System.out.println("Exception handled in divide Method");

throw e;

}

finally

{

System.out.println("Division completed");

}
}}

//this is when we inform the main method that there iis an exception and we throw e in the try and catch; this is rethrowing the error a s handling the exception.