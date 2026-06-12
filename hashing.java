import java.util.*;

import java.util.Scanner;



public class hashing {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);





HashSet<Integer> empid = new HashSet();



System.out.println("Enter ID : ");

int n = scan.nextInt();





for(int i=0; i<=n-1; i++)
{
int id = scan.nextInt();
empid.add(id);

}
while(true)

{

       String operation = scan.next();

       switch(operation){
                      case "ADD" :
        empid.add(scan.nextInt());
        System.out.println(empid);
                       break;



case "REMOVE" :

empid.remove(scan.nextInt());

System.out.println(empid);

break;



case "CHECK" :

if(empid.contains(scan.nextInt()))

{

System.out.println("YES");

}

else

{

System.out.println("NO");

}

break;



case "PRINT" :

if(empid.isEmpty())

{

System.out.println("EMPTY");

}

else

{

System.out.println(empid);

}

break;



case "STOP":

return;



default : System.out.println("Invalid operation");

}

}

}



} 

