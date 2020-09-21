//Method Overloading
public class Addition {

    static int add(int a, int b){
        return a+b;
    }  
    static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Addition of two integers : " + Addition.add(15, 30));
        System.out.println("Addition of two doubles : " + Addition.add(16.80, 45.46));
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
