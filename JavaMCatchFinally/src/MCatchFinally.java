import java.util.Scanner;

public class MCatchFinally {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        try {         
            System.out.print("Enter a number : ");
            int n = Integer.parseInt(sc.nextLine());
            if (30 % n == 0) {
                System.out.println(n + " is a factor of 30"); 
            }
        } 
        catch (ArithmeticException e) {         
            System.out.println("Arithmetic Exception : " + e); 
        } 
        catch (NumberFormatException e) {         
            System.out.println("Number Format Exception : " + e); 
        }
        finally {
            System.out.println("Ashank Juyal\n45-IT-18");
        }
    }
    
}
