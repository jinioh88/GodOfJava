package e.io.object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator+"godofjava"+separator+"text"+separator+"serial.obj";
        SerialDTO dto = new SerialDTO("GodOfJavaBook",1,true,100);
        manager.saveObject(fullPath,dto);
    }

    public void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(oos!=null) {
                try {
                    oos.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null) {
                try{
                    fos.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
