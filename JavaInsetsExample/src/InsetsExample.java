import javafx.geometry.Insets; 
  
public class InsetsExample { 
    
    public static void main(String args[]) {
        Insets insets_1 = new Insets(20.0f); 
        Insets insets_2 = new Insets(20.0f, 40.0f, 60.0f, 70.0f); 
  
        // display the insets 
        display(insets_1); 
        display(insets_2); 
        System.out.println("Ashank Juyal\n45-IT-18");
    } 
      
    public static void display(Insets insets) { 
        double left, right, bottom, top; 
  
        // get the insets 
        left = insets.getLeft(); 
        right = insets.getRight(); 
        bottom = insets.getBottom(); 
        top = insets.getTop(); 
  
        // display the insets 
        System.out.println("Insets of the object"); 
        System.out.println("Left = " + left + ", Right = " + right + ", Bottom = " + bottom + ", Top = " + top);
    } 
    
} 