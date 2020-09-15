import java.util.Scanner;

public class Pascal {
    static int factorial(int n) {
        int f;
        
        for(f = 1; n > 1; n--){
            f *= n;
        }
        
        return f;
    }
    
    static int ncr(int n,int r) {
        return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int n = sc.nextInt();   
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
