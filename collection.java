import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class collection {
    public static void main(String[] args){
        Map<String, Integer> issue = new HashMap<>();

        issue.put("bug1", 104);
        issue.put("bug2", 150);
        issue.put("bug3", 10);
        issue.put("bug4", 1);

            System.out.println(issue);

            Comparator<Integer> com = new Comparator<Integer>(){
                public int compare(Integer a, Integer b){
                        return a.compareTo(b);
                }
            };

            List<Integer> nums = new ArrayList<>();
            nums.add(10);
                nums.add(20);
                nums.add(30);
                nums.add(40);
    

                Collections.sort(nums , com);
                System.out.println(nums);


                nums.stream()
                    .filter(n -> n > 15)
                    .forEach(n -> System.out.println(n));
    }
}


//the result is not the same sequence as we put the values in the map because the map is not ordered and it is a collection of key value pairs and it is a part of collection framework in java and it is
//there are 3 types of collections and those are collection api= concept, collections = class and collection interface
// stack and queue are the two types of collection and stack is a last in first out and queue is a first in first out