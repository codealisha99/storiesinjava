package firstjdbc;

public class demo {
    public static void main(String[] args) {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");

    } catch(Exception e){
        e.printStackTrace();
}
}
}