import java.util.Scanner;

public class count {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter the number :");

int n = scan.nextInt();

int count = 0;

for(int i=2; i<=Math.sqrt(n); i++)
{

if(n%i == 0)
{
     count++;
}

}
     if(count == 0)
                {
System.out.println("Prime");

}

else

{

System.out.println("Not a prime ");

}

}

}
