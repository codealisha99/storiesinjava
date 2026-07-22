package filemanage;
import java.util.FileInputStream;
import java.io.File;
import java.io. FileOutputStream;


public class demo {

    String path1 = "";
    String path2 = "";

    FileInputStream fis = new FileInputStream(path1);
    FileOutputStream fos = new FileOutputStream(path2);

    int data;

    while((data = fis.read()) != -1) {
        fos.write(data);
    }

    fis.close();
    fos.close();
    
}
