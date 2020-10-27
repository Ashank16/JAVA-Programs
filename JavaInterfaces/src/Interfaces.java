class Test { 
    interface Yes {
        void show(); 
    } 
} 

class Testing implements Test.Yes {
    public void show() {
        System.out.println("Show method of Interface"); 
    } 
}
public class Interfaces {

    public static void main(String[] args) {
        Test.Yes obj; 
        Testing t = new Testing(); 
        obj = t; 
        obj.show();
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
