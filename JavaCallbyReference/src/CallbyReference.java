//Call By Reference
class Test {
    int a, b;
    
    Test(int i, int j) {    
        a = i;
        b = j;
    }
    
    // pass an object 
    void meth(Test o) {    
        o.a = o.a * 2;
        o.b = o.b / 2;
    }
}

public class CallbyReference {

    public static void main(String[] args) {
        Test obj = new Test(150, 200);
        
        int a = 150, b = 200;
        
        System.out.println("The value of obj.a and obj.b before call :");
        System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);
        
        obj.meth(obj);
        
        System.out.println("\nThe value of obj.a and obj.b after call : ");
        System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
