


 public class learn {

    public static void main(String[] args) {
        System.out.println("hi lishy");
        System.out.println("******\n    *\n  *\n*    \n******");
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println("The sum is " + sum);

        int a = 15;
        int b = 25;

        if(a==b){
            System.out.println("a is equal to b");
        }
        else{

            if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is less than b");
        }
        }

        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if(marks>90){
            System.out.println("EXCELLENt!!!");
        }
        else 
            if(marks>80 && marks<=90){
                System.out.println("GOOD!!");
            }
        
        else 
            if(marks>70 && marks<=80){
                System.out.println("FAIR!");
            }
        
        else 
            if(marks>60 && marks<=70){
                System.out.println("MEETS EXPECTATIONS");
            }
        
        else {
            System.out.println("POOR");
        }
    }
}
