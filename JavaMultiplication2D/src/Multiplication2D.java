import java.util.Scanner;

public class Multiplication2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstMatrix[][] = new int[2][2];
        int secondMatrix[][] = new int[2][2];        
        //Taking input for 1st Matrix
        System.out.println("Enter the elements of first matrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        //Taking input for 2nd Matrix
        System.out.println("Enter the elements of second matrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        //Printing first Matrix elements
        System.out.println("First Matrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        //Printing second Matrix elements
        System.out.println("Second Matrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }        
        
        // Mutliplying Two matrices
        int product[][] = new int[2][2];
        System.out.println("Product of the 2 matrices are : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }    
        System.out.println("Ashank Juyal\n45-IT-18");
    }
    
}
