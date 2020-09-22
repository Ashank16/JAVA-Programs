//Multilevel Inheritance
class Car {
   public void display() {
      System.out.println("Inside display of Car");
   }
}
class Audi extends Car {
   public void color() {
      System.out.println("Inside color of Audi");
   }
}
class AudiQ8 extends Audi {
   public void engine() {
      System.out.println("Inside engine of AudiQ8");
   }
}

public class Vehicle {

    public static void main(String[] args) {
        AudiQ8 car = new AudiQ8();
        car.display();
        car.color();
        car.engine();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
