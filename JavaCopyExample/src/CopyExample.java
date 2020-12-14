import java.io.*;
 
public class CopyExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File infile = new File("C:\\Users\\Owner\\Desktop\\abc.txt");
            File outfile = new File("C:\\Users\\Owner\\Desktop\\xyz.txt");
            fis = new FileInputStream(infile);
            fos = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
               fos.write(buffer, 0, length);
            } 
            fis.close();
            fos.close();
            System.out.println("File copied successfully!!");
            System.out.println("Ashank Juyal\n45-IT-18");
        } 
        catch(IOException ioe) {
           ioe.printStackTrace();
        } 
    }
}
