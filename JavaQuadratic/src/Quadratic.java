import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of a : ");
	double a = sc.nextDouble();
	System.out.print("Enter the value of b : ");
	double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();

	double determinant = (b*b)-(4*a*c);
	double sqrt = Math.sqrt(determinant);

	if (determinant>0) {
	    double  firstRoot = (-b + sqrt)/(2*a);
	    double secondRoot = (-b - sqrt)/(2*a);
	    System.out.println("First root is : " + firstRoot);
	    System.out.println("Second root is : " + secondRoot);
	}
        else if (determinant == 0) {
            double equalRoot = (-b)/(2*a);
	    System.out.println("The two equal roots are : " + equalRoot);
	}
        else {
            System.out.println("Roots are imaginary");
        }
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
