import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Ashank"," ");  
        while (st.hasMoreTokens()) {  
            System.out.println(st.nextToken());  
        }
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
