import java.util.HashSet; 
  
public class HashSetExample { 
  
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>(); 
        // Adding elements to the HashSet 
        hs.add("Apple"); 
        hs.add("Mango"); 
        hs.add("Banana"); 
        
        System.out.println("Before adding duplicate values : " + hs); 
  
        // Addition of duplicate elements 
        hs.add("Apple"); 
        hs.add("Mango"); 
  
        System.out.println("After adding duplicate values : " + hs); 
  
        // Addition of null values 
        hs.add(null); 
        hs.add(null); 
  
        // Displaying HashSet elements 
        System.out.println("After adding null values : " + hs); 
        System.out.println("Ashank Juyal\n45-IT-18");
    } 
} 
