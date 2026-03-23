package EcoScore;
import java.util.*;
class User{
    int id;
    String name;
    int ecoScore;


    User(int id, String name){
        this.id = id;
        this.name = name;
        this.ecoScore = 0;

    }

}
class Action {
    int userId;
    int plasticRecycled;
    boolean usedTransport;
    int treesPlanted;

    Action(int userId, int plasticRecycled, boolean usedTransport, int treesPlanted) {
        this.userId = userId;
        this.plasticRecycled = plasticRecycled;
        this.usedTransport = usedTransport;
        this.treesPlanted = treesPlanted;
    }
}



public class EcoScoreApp{
    public static void main(String[] args){

       

           ArrayList<User> users = new ArrayList<>();
           ArrayList<Action> actions = new ArrayList<>();

          

              users.add(new User(1, "alisha"));
              users.add(new User(2, "ali"));
              users.add(new User(3, "lisha"));


              actions.add(new Action(1, 5, true, 4));
              actions.add(new Action(2, 8, false, 2));
              actions.add(new Action(3, 2, true, 8));



       
        
           

          

           for (User u : users){
                System.out.println(u.name);
           }
           for (Action a : actions){
               for (User u : users){
                   if (u.id == a.userId){
                     int Score = 0;
                     Score += a.plasticRecycled * 10;
                        if(a.usedTransport){
                            Score += 20;
                        
                        }
                        Score += a.treesPlanted * 50; 
                        u.ecoScore += Score;
                   }
               }
           }
           for (int i = 0; i < users.size(); i++)
             { 
                for (int j = i + 1; j < users.size(); j++) 
                    { 
                        if (users.get(j).ecoScore > users.get(i).ecoScore)
                             { 
                                User temp = users.get(i);
                                users.set(i, users.get(j));
                                 users.set(j, temp); 
                                
                            } 
                    } 
                    }
           System.out.println("Leaderboard-Eco Scores:");

for (User u : users) {
    System.out.println(u.name + " -> " + u.ecoScore);
}
    }
    }