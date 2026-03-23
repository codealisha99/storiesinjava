package snacky;

import java.util.ArrayList;
import java.util.Scanner;

public class snakegame {
    public static void main(String[] args){
        int width = 10;
        int height = 10;


        ArrayList<int[]> snake = new ArrayList<>();
        snake.add(new int[]{5, 5}); // starting position

               int foodX = 3;
               int foodY = 3;

         char direction = 'R';



         for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
        
                boolean isSnake = false;
        
                for (int[] s : snake) {
                    if (s[0] == i && s[1] == j) {
                        System.out.print("O ");
                        isSnake = true;
                        break;
                    }
                }
        
                if (!isSnake) {
                    if (i == foodX && j == foodY) {
                        System.out.print("* ");
                    } else {
                        System.out.print(". ");
                    }
                }
            }
            System.out.println();
        }


        while(true){
            Scanner sc = new Scanner(System.in);

           System.out.print("Move (W/A/S/D): ");
          char input = sc.next().charAt(0);

            direction = input;
        }
    }
}
