import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        //Automatic Conversion
        int first = sc.nextInt();
        long second = first;
        float third = second;
        System.out.println("Integer value : " + first);
        System.out.println("Long value : " + second);
        System.out.println("Float value : " + third);
        
        //Explicit type casting
        System.out.print("Enter a double : ");
        double fourth = sc.nextDouble();
        long fifth = (long)fourth;
        int sixth = (int)fifth;  
        System.out.println("Double value : " + fourth);
        System.out.println("Long value : " + fifth);
        System.out.println("Integer value : " + sixth);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
