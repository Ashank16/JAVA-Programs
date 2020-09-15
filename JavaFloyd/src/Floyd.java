import java.util.Scanner;

public class Floyd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int number = sc.nextInt();
        int val = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
