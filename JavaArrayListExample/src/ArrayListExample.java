import java.util.*;

public class ArrayListExample {
    
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();    //Creating arraylist    
        //Adding object in arraylist
        fruits.add("Mango");    
        fruits.add("Apple");    
        fruits.add("Banana");    
        fruits.add("Grapes");
        //Printing the arraylist object   
        System.out.println("Original list : " + fruits);
        
        //accessing the element    
        System.out.println("Returning element at index 1 : " + fruits.get(1));  //it will return the 2nd element, because index starts from 0  
        
        //changing the element  
        fruits.set(1, "Orange"); 
        
        //Printing the arraylist object   
        System.out.println("List after changing the element : " + fruits);
        
        //Sorting the list  
        Collections.sort(fruits);  
        
        //Printing the arraylist object   
        System.out.println("List after sorting the elements : " + fruits);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
