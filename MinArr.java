import java.util.Scanner;

public class MaxArrayElement {

public static void main(String[] args) {



Scanner scan = new Scanner(System.in);



System.out.println("Enter size of the Array :");



int size = scan.nextInt();

///int arr[] = new int[scan.nextInt()];



int arr[] = new int[size];



System.out.println("Enter Array elements :");

for(int i=0 ;i<=arr.length-1; i++)

{

arr[i] = scan.nextInt();

}

// step1

int min = arr[0];



for(int i=0; i<=arr.length-1; i++)

{

if(arr[i] < min)

{

min = arr[i];

}

}



System.out.println("Min element is :" + min);

}



}