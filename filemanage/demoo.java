package filemanage;
import java.util.FileInputStream;
import java.io.File;
import java.io. FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;




public class demoo {
    String path1 = "";
    String path2 = "";

    FileReader fr = null;
    FileWriter fw = null;


   
    try {

        fr = new FileReader(path1);
        fw = new FileWriter(path2);

        int data;

    while((data = fis.read()) != -1) {
        fos.write(data);
    }

}
    catch (Exception e2) {
        e2.printStackTrace();
    }
    

    finally {

        try{
        if(fr != null) {
            fr.close();
        }

        if(fw != null) {
            fw.close();
        }
    
    }

    catch (Exception e3) {
        e3.printStackTrace();
    }
}
