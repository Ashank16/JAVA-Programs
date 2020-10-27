// Base class vehicle 
class Vehicle {
    int maxSpeed = 120; 
} 
  
// sub class Car extending vehicle 
class Car extends Vehicle { 
    int maxSpeed = 180; 
  
    void display() { 
        // print maxSpeed of base class (Vehicle) 
        System.out.println("Maximum Speed of Base class Vehicle : " + super.maxSpeed);
        // print maxSpeed of sub class (Car) 
        System.out.println("Maximum Speed of Sub class Car : " + maxSpeed);
    } 
}
public class Super_Keyword {

    public static void main(String[] args) {
        Car small = new Car(); 
        small.display();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
