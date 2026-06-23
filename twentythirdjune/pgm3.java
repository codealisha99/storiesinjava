package twentythirdjune;
import java.util.*;






public class Pgm3 {

public static void main(String[] args) {

String s1 = new String("Key");

String s2 = new String("Key");

HashMap hm = new HashMap();

hm.put(s1, "Value1");

hm.put(s2, "Value2");

System.out.println(hm);// {Key = Value1, Key=Value2} wrong

//{Key=Value2}

}

}