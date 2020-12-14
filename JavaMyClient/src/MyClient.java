import java.io.*;  
import java.net.*;  

public class MyClient {  
    public static void main(String[] args) {  
        try {      
            Socket s = new Socket("localhost",6969);  
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());  
            dout.writeUTF("Ashank Juyal\n45-IT-18");  
            dout.flush();  
            dout.close();  
            s.close();  
        }catch(Exception e){System.out.println(e);}  
    }  
}
