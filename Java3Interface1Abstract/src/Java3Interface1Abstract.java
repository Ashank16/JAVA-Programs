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
         System.out.println("Speed of Bicycle : " + speed + "km/hr"); 
    } 
} 
  
class Bike implements Vehicle {       
    int speed;

    //to increase speed
    public void speedUp(int increment){
        speed += increment; 
    } 
     
    public void printSpeed() { 
         System.out.println("Speed of Bike : " + speed + "km/hr"); 
    } 
} 

//Abstract class
abstract class Name { 
    abstract void print(); 
} 

class PrintName extends Name { 
    void print() { 
        System.out.println("Ashank Juyal\n45-IT-18"); 
    } 
} 

public class Java3Interface1Abstract {

    public static void main(String[] args) {
        //creating an inatance of Bicycle  
        Bicycle bicycle = new Bicycle();  
        bicycle.speedUp(12);
        bicycle.printSpeed(); 
          
        //creating instance of the bike. 
        Bike bike = new Bike(); 
        bike.speedUp(40);
        bike.printSpeed();
        
        //Reference of Name type. 
        Name n = new PrintName(); 
        n.print(); 
    }
    
}
