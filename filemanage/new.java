package filemanage;
import java.util.FileInputStream;
import java.io.File;
import java.io. FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class new {
    String path1 = "";
    String path2 = "";

    FileReader fr = null;
    FileWriter fw = null;

    BufferedReader br = null;
    BufferedWriter bw = null;
   
    try {

        fr = new FileReader(path1);
        fw = new FileWriter(path2);

        br = new BufferedReader(fr);
        bw = new BufferedWriter(fw);

        String data;

    while((data = br.readLine()) != null) {
        bw.write(data);
    }

}
    catch (Exception e2) {
        e2.printStackTrace();
    }
    

    finally {

        try{
//close the motor first
            if(br != null) {
                br.close();
            }

            if(bw != null) {
                bw.close();
            }


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
