


 public class learn {

    public static void main(String[] args) {
        System.out.println("hi lishy");
        System.out.println("******\n    *\n  *\n*    \n******");

    }
}
String s = "Java";
String rev = "";

for (int i = s.length() - 1; i >= 0; i--) {
    rev += s.charAt(i);
}
System.out.println(rev);
String s = "Java";
String reversed = new StringBuilder(s).reverse().toString();
System.out.println(reversed);
String s = "madam";
String rev = new StringBuilder(s).reverse().toString();

System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
