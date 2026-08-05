import java.sql.PreparedStatement;
import java.util.Scanner;

public class FetchRecord {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
PreparedStatement ps = null;
            Scanner sc = new Scanner(System.in);
            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstjdbc", "root", "root");
            System.out.println("Connection established");

            // Create a statement
            Statement stmt = con.createStatement();
            System.out.println("Statement created");

            // Execute the query
            String sql = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("Query executed");

            // Fetch records and create Employee objects
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                Employee emp = new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("department"),
                    rs.getDouble("salary")
                );
                employees.add(emp);
            }

            // Print employee details
            for (Employee emp : employees) {
                System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getAge() + " " +
                                   emp.getDepartment() + " " + emp.getSalary());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
