//Classes and Objects
public class Car {
    
    String name;
    String color;
    
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    //method 1
    public String getName() {
        return name;
    }
    
    //method 2
    public String getColor() {
        return color;
    }
    
    public static void main(String[] args) {
        Car Audi = new Car("Audi", "Black");
        Car BMW = new Car("BMW", "Alpine White");
        System.out.println("Name of the Car is : " + Audi.getName() + " and the color of the Car is : " + Audi.getColor());
        System.out.println("Name of the Car is : " + BMW.getName() + " and the color of the Car is : " + BMW.getColor());
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
