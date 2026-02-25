import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Magic Trick!");
        System.out.print("Think of a number and enter it: ");

        int original = sc.nextInt();

        int step1 = original * 2;
        int step2 = step1 + 10;
        int step3 = step2 / 2;
        int result = step3 - original;

        System.out.println("Your final number is: " + result);
        System.out.println("See! I predicted it 😎");

        sc.close();
    }
}
 //public class learn{
        
    //static public void main(String[] args) {
   
         //System.out.println("Monday");
         //System.out.print("Tuesday");
         //System.out.println("Wednesday");
         //System.out.println("Thursday");
         //System.out.print("Friday");
         //System.out.println("Saturday");
         //System.out.println("Sunday");
        

          
          //}






               
      //int a = 10;
      //int result = 0; 

      //int result = a%2==0 ? 20 : 45;

      //System.out.println(result);

       //int i = 0;

         //while(true){
         //System.out.println("HELLO " + i);

           // i++;
         //}
   

         //for(int i = 0; i < 5; ++i){
            //System.out.println("HELLO " + i);
         //}

         //for(int i = 0; i < 5; i++){
           // System.out.println("DAY " + i);

            //for(int j = 9; j<=18 ; j++){
              //  System.out.println(j + "th HOUR");
            //}
//}
       
       
    
