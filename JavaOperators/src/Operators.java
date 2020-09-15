import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arithmetic operator
        System.out.print("Enter the first number : ");
	int first = sc.nextInt();
        System.out.print("Enter the second number : ");
	int second = sc.nextInt();
	int a = first*first + second*second + 2*first*second;
	System.out.println("Arithmetic operator : " + a);
	//Bitwise operator
	int b = first | second;
	System.out.println("Bitwise operator : " + b);
	//Assignment operator
	first += second;
	System.out.println("Assignment operator : " + first);
        //Comparison operator
	System.out.print("Comparison operator : ");
        System.out.println(first > second);
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
