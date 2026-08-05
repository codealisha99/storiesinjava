package firstjdbc;

import java.beans.Statement;
import java.sql.DriverManager;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class demo {
    public static void main(String[] args) {

    try {
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");


        Connection con;
        //establish the connection
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjdbc", "root", "root");

        System.out.println("Connection established");



        //create a statement
        Statement stmt = con.createStatement();
        System.out.println("Statement created");


        //execute the query
        String sql = "select * from employee";


        stmt.executeQuery(sql);

        ResultSet rs = stmt.getResultSet();

        System.out.println("Query executed");

        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " "
                    + rs.getDouble(5));
        }

    } catch(Exception e){
        e.printStackTrace();
}
}
}