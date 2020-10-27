class A { 
    void m1() {
        System.out.println("Inside A's m1 method"); 
    } 
} 
  
class B extends A { 
    void m1() { 
        System.out.println("Inside B's m1 method"); 
    } 
} 
  
class C extends A {
    void m1() { 
        System.out.println("Inside C's m1 method"); 
    } 
}
public class Dispatch {

    public static void main(String[] args) {
        A a = new A();          
        B b = new B(); // object of type B           
        C c = new C(); // object of type C         
        A ref; // obtain a reference of type A          
         
        ref = a;
        ref.m1();
        ref = b;
        ref.m1(); 
        ref = c;
        ref.m1(); 
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
