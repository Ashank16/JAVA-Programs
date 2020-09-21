//Call By Value
class Test {
    void meth(int i, int j) {    
        i = i * 2;
        j = j / 2;
        
        System.out.println("\nThe value of a and b in method after performing action : ");
        System.out.println("a = " + i + "\t b = " + j);
    }
}

public class CallbyValue {

    public static void main(String[] args) {
        Test obj = new Test();
        
        int a = 150, b = 200;
        
        System.out.println("The value of a and b before call :");
        System.out.println("a = " + a + "\t b = " + b);
        
        obj.meth(a, b);
        
        System.out.println("\nThe value of a and b after call : ");
        System.out.println("a = " + a + "\t b = " + b);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
