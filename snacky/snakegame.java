package snacky;

import java.util.ArrayList;
import java.util.Scanner;

public class snakegame {
    public static void main(String[] args){
        int width = 10;
        int height = 10;


        ArrayList<int[]> snake = new ArrayList<>();
        snake.add(new int[]{5, 5}); //it is the starting point of the snake 

               int foodX = 3;//it is the x coordinate of the food
               int foodY = 3;//it is the y coordinate of the food

               class Order {
                int id;
                String type; // BUY or SELL
                int quantity;
                double price;
            
                Order(int id, String type, int quantity, double price) {
                    this.id = id;
                    this.type = type;
                    this.quantity = quantity;
                    this.price = price;
                }
            }

               ArrayList<Order> buyOrders = new ArrayList<>();
               ArrayList<Order> sellOrders = new ArrayList<>();

               for (Order buy : buyOrders) {
                for (Order sell : sellOrders) {
            
                    if (buy.price >= sell.price) {
            
                        int tradedQty = Math.min(buy.quantity, sell.quantity);
            
                        System.out.println("Trade executed: " + tradedQty + " shares at " + sell.price);
            
                        buy.quantity -= tradedQty;
                        sell.quantity -= tradedQty;
                    }
                }
            }

         
    }
}
