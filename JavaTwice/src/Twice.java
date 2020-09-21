//Returning Objects
import java.util.Scanner;

public class Twice {
    
    private int value;
    
    public Twice(int i) {
        value = i;
    }
    
    public Twice makeTwice() {
        Twice number = new Twice(2 * value);
        return number;
    }
    
    public void show() {
        System.out.println("Value is doubled : " + value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt(); 
        Twice obj1 = new Twice(n);
        Twice obj2;
        
        obj2 = obj1.makeTwice();
        obj2.show();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
