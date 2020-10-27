import java.util.*;

public class Queue_Demo {

    public static void main(String[] args) {
        // Creating empty priority queue 
        Queue<Integer> pQueue = new PriorityQueue<Integer>();             
  
        // Adding items to the pQueue using add()        
        pQueue.add(10); 
        pQueue.add(20); 
        pQueue.add(30); 
        
        System.out.println("Elements present in the Queue : " + pQueue);
        // Printing the top element of the PriorityQueue          
        System.out.println("Top element of the PriorityQueue : " + pQueue.peek()); 
        
        System.out.println("Elements present in the Queue : " + pQueue);
        // Printing the top element and removing it from the PriorityQueue container  
        System.out.println("Printing Top element of the the PriorityQueue container and then removing it : " + pQueue.poll()); 
        
        System.out.println("Elements present in the Queue : " + pQueue);
        // Printing the top element again 
        System.out.println("Printing the top element again : " + pQueue.peek());
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
