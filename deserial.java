import java.io.File;
import java.io.ObjectInputStream;

public class deserial {
    public static void main(String[] args) throws IOException , classnotfoundexception {
        String path = "C:\\Users\\Admin\\Desktop\\test.txt";
        FileInputStream fis = new FileInputStream(path);

        ObjectInputStream ois = new ObjectInputStream(fis);


        Student student = (Student)(ois.readObject());


       System.err.println(student);

    }
}
