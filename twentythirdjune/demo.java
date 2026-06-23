package twentythirdjune;
import java.util.HashMap;
import java.util.WeakHashMap;

public class demo {
    public static void main(String[] args) {
        WeakHashMap<String, String> whm = new WeakHashMap<>();
        String key1 = new String("key1");
        String key2 = new String("key2");
        whm.put(key1, "value1");
        whm.put(key2, "value2");
        System.out.println(whm);
        key1 = null;
        System.gc();
        Syste.out.println(whm);











        //String s = "Hello, World!";
        //System.out.printn(s);
        //s = null;
        //System.gc();
        //System.out.println(s);
    }
}
