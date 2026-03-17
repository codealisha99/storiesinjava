import java.util.Scanner;



public class Demo1 {



	public static void main(String[] args) {

		

		 Scanner scan = new Scanner(System.in);

		 System.out.println("Enter a byte value :");

		 byte a = scan.nextByte();

		 System.out.println("Byte value : " +a);

		 System.out.println("Enter a short value : ");

		 Short b= scan.nextShort();

		 System.out.println("Short value : " +b);

		 System.out.println("Enter integer value : ");

		 int c = scan.nextInt();

		 System.out.println("Integer value : " +c);

		 System.out.println("Enter long value : ");

		 long d = scan.nextLong();

		 System.out.println("Long value :" + d);

		 

		 System.out.println("Enter float : ");

		 float e= scan.nextFloat();

		 System.out.println("float val :" + e);

		 System.out.println("Enter double :");

		 double f = scan.nextDouble();

		 System.out.println("double value : " +f);

		 System.out.println("ENter boolean :");

		 boolean g= scan.nextBoolean();

		 System.out.println("boolean value : " +g);

		 System.out.println("Enter your full name: ");

		 string fullname = scan.nextLine();

		 System.out.println("my full name is " +fullname);



	}



}