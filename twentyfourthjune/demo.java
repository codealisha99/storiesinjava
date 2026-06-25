package twentyfourthjune;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class demo {
    public static void main(String[] args) {
    CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

//enhanced loop
for (int x : list) {
    System.out.print(x + " ");
    list.add(99);
}
System.out.println();
System.out.println(list);
 }

}





//normal loop
//for (int i = 0; i <= list.size() - 1; i++) {
  //  System.out.println(list.get(i));
    //list,add(99);
//}

 //iterator
    //Iterator<Integer> itr = list.iterator();

    //while(itr.hasNext()) {
      //  System.out.println(itr.next());
       // list.add(99);
    //}

    //System.out.println(list);
//}