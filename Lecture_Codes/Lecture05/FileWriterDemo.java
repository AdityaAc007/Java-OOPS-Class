import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String [] args){
        File f1=null;
        FileWriter fw = null; //Char text
        long length = 0;
        try{
            f1 = new File("C:\\College Related\\Programming\\Java oops\\Lecture 5\\name");
            fw = new FileWriter(f1);
            fw.write("My name is Abhinav");
            length = f1.length();
            System.out.println("Before close length: "+ length);
        } 
        catch(IOException ref){
            ref.printStackTrace();
        }
        finally{
            try{
                if(fw!=null){
                    fw.flush();
                    fw.close();
                    fw = null;
                }
            }
            catch(IOException ref){
                    ref.printStackTrace();
            }
        }
        System.out.println("After close length: "+ f1.length());
    }
    
}
