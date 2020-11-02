import java.util.*;

public class VectorMethods {

    public static void main(String[] args) {
        Vector<Integer> vectorObject = new Vector<Integer>(4);
        //void add(int index, E element)
        vectorObject.add(0,3);
        vectorObject.add(1,5);
        
        for(Integer integer: vectorObject) {
            System.out.println("Index : " + vectorObject.indexOf(integer) + " Value : " + integer);
        }

        //Adding element at index 
        vectorObject.add(1, 10);
        System.out.println("After adding value at index 1 : ");
        for(Integer integer: vectorObject) {   
            System.out.println("Index : " + vectorObject.indexOf(integer) + " Value : " + integer);
        }
        
        //remove function
        // removing first occurrence element at 1 
        vectorObject.remove(0); 
        System.out.println("After removing value at index 0 : ");
        
        // checking vector 
        for(Integer integer: vectorObject) {   
            System.out.println("Index : " + vectorObject.indexOf(integer) + " Value : " + integer);
        }
        
        //void clear()
        vectorObject.clear();
        
        //Clearing the elements from Vector
        System.out.println("Clearing all elements in the Vector : ");
        System.out.println("Values in Vector object are : " + vectorObject);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
