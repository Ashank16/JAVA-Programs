import java.io.*; 
  
interface Vehicle {       
    //abstract method
    void speedUp(int a); 
} 
  
class Bicycle implements Vehicle{       
    int speed;
    //to increase speed 
    public void speedUp(int increment){
        speed += increment; 
    } 
    
    public void printSpeed() { 
         System.out.println("Speed of Bicycle : " + speed); 
    } 
} 
  
class Bike implements Vehicle {       
    int speed;

    //to increase speed
    public void speedUp(int increment){
        speed += increment; 
    } 
     
    public void printSpeed() { 
         System.out.println("Speed of Bike : " + speed); 
    } 
} 

//Abstract class
abstract class Name { 
    abstract void print(); 
} 

class Derived extends Name { 
    void print() { 
        System.out.println("Ashank Juyal\n45-IT-18"); 
    } 
} 

public class Java3Interface1Abstract {

    public static void main(String[] args) {
        //creating an inatance of Bicycle  
        Bicycle bicycle = new Bicycle();  
        bicycle.speedUp(3);
        bicycle.printSpeed(); 
          
        //creating instance of the bike. 
        Bike bike = new Bike(); 
        bike.speedUp(4);
        bike.printSpeed();
        
        //Reference of Name type. 
        Name n = new Derived(); 
        n.print(); 
    }
    
}
