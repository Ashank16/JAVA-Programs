import java.io.*;  
  
public class RandomAccessFileExample {  
    static final String FILEPATH = "C:\\Users\\Owner\\Desktop\\raf.txt";  
    public static void main(String[] args) {  
        try {  
            System.out.println(new String(readFromFile(FILEPATH, 0, 15)));  
            writeToFile(FILEPATH, "World", 5); 
            System.out.println("Ashank Juyal\n45-IT-18");
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size) throws IOException {              
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}
