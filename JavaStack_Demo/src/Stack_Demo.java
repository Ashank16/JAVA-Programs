import java.util.*;

public class Stack_Demo {
    
    public static void main(String[] args) {
        // Default initialization of Stack 
        Stack stack1 = new Stack(); 
        
        //Pushing elements
        stack1.push("Audi"); 
        stack1.push("BMW"); 
        stack1.push("Mercedes");
        
        // Displaying the Stack
        System.out.println("Initial Stack : " + stack1); 
        
        //Displaying element at the top of the stack
        System.out.println("The element at the top of the stack is : " + stack1.peek());
        
        // Removing elements using pop() method 
        System.out.println("Popped element: " + stack1.pop());
        
        // Displaying the Stack after pop operation 
        System.out.println("Stack after pop operation : " + stack1);
        System.out.println("Ashank Juyal\n45-IT-18");                                                        
    }
    
}
