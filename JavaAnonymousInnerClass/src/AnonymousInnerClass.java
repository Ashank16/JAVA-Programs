abstract class Person{  
    abstract void eat();  
}
public class AnonymousInnerClass {

    public static void main(String[] args) {
        Person p = new Person() {  
            void eat() {
                System.out.println("Nice fruits");
            }  
        };  
        p.eat();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
