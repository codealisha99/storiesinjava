import java.util.Scanner;

public class ArraySum {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter the size of the Array : ");

int size = scan.nextInt();//this takes the size of the array from the user



int a[] = new int[size];



System.out.println("Enter the Elements : ");

for(int i=0; i<=a.length-1; i++)

{

a[i] = scan.nextInt();

}



int sum = 0;







for(int i=0; i<=a.length-1; i++)

{

sum = sum + a[i];

}



System.out.print("Array :");



System.out.print("[");

for(int i=0; i<=a.length-1; i++)

{

if(i < size-1)

{

System.out.print(a[i] + ", ");

}

else

{

System.out.print(a[i]);

}

}

System.out.println("]");





System.out.println("Array sum is : " + sum);



}



}