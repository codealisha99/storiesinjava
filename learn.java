 class computer{

   public void  getmeice(){
      System.out.println("I will buy an icecream");
   }

   public  String getmepen(int cost){
      if(cost > 10){
         return "I will buy pen";
      }
      else{
         return "I will not buy pen";
      }
   }
   
 }
 
 
 
 
 
 public class learn{
        
    public static void main(String[] args) {
   
         
           computer obj = new computer();
           obj.getmeice();


           
             String pen = obj.getmepen(20);
             System.out.println(pen);






               
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
         }
       
       
    }
