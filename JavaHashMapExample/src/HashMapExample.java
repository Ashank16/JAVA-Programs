import java.util.HashMap; 
  
public class HashMapExample { 
  
    public static void main(String[] args) {
        /* This is how to declare HashMap */
        HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
  
        /*Adding elements to HashMap*/
        hm.put(12, "Apple"); 
        hm.put(2, "Mango"); 
        hm.put(7, "Banana"); 
  
        System.out.println("HashMap object output : " + hm); 
  
        // store data with duplicate key 
        hm.put(12, "Apple"); 
  
        System.out.println("After inserting duplicate key : " + hm);
        System.out.println("Ashank Juyal\n45-IT-18");
    } 
} 
