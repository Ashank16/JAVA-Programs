import java.io.*; 

class Demo implements Serializable {
    String s = "Cars";
}

public class SerializeDemo {  
    public static void main(String args[]) {  
        try {  
            //Creating the object  
            Demo d1 = new Demo();  
            
            //Creating stream and writing the object  
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Owner\\Desktop\\ser.txt");  
            ObjectOutputStream oos = new ObjectOutputStream(fos);  
            oos.writeObject(d1);  
            oos.flush(); 
            
            //closing the stream  
            oos.close();  
            System.out.println("Object has been serialized"); 
            System.out.println("Ashank Juyal\n45-IT-18");
        }
        catch(Exception e) {
            System.out.println(e);
        }  
    }  
}
