import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double first = sc.nextDouble();
        System.out.print("Enter second number : ");
        double second = sc.nextDouble();
        System.out.println("Enter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division");
        int input = sc.nextInt();
        switch(input) {
            case 1:
                System.out.println("Output : " + (first + second));
                break;
            case 2:
                System.out.println("Output : " + (first - second));
                break;                
            case 3:
                System.out.println("Output : " + (first * second));
                break;  
            case 4:
                System.out.println("Output : " + (first / second));
                break; 
            default:
                System.out.println("Wrong input given");
        }
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
