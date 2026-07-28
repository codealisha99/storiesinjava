import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;


class Employee implements Serializable {
    

    int id;
    String name;
    int age;
    String department;
    double salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return id == other.id && age == other.age && Double.compare(other.salary, salary) == 0
                && Objects.equals(name, other.name) && Objects.equals(department, other.department);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department
                + ", salary=" + salary + "]";
    }

    
    
}

class EmployeeSerial{
   public static void main(String[] args) throws IOException {
        Employee emp = new Employee(1, "John Doe", 30, "IT", 50000.0);
        System.out.println(emp);

        String path1 = "/Users/alishakarma/Desktop/wow.txt";

        FileOutputStream fos = new FileOutputStream(path1);

        ObjectOutputStream oos = new ObjectOutputStream(fos);


        oos.writeObject(emp);

        oos.close();
        fos.close();
    }

}


class EmployeeDeserial {
 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "/Users/alishakarma/Desktop/wow.txt";
        FileInputStream fis = new FileInputStream(path);

        ObjectInputStream ois = new ObjectInputStream(fis);
   
        Employee emp = (Employee)(ois.readObject());

        System.err.println(emp);
}
}