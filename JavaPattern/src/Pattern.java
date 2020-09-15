import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();   
        for(int i = 0; i <= n; i+=2) {
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" " + "*");
            }
            System.out.println();
        }
        System.out.println("Ashank Juyal\n45-IT-18");        
    }
    
}
