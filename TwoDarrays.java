// import java.util.Scanner;

// public class TwoDarrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int row=sc.nextInt();
//         int column=sc.nextInt();
//         int numbers [][] = new int [row][column];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 numbers[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<column;j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }

import java.util.Scanner;

/**
 * TwoDarrays
 */
// public class TwoDarrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int m= sc.nextInt();
//         int matrix[][]= new int [n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[n][m]=sc.nextInt();
//             }
//         } 
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[n][m]);
//             }
//         }
//     }
    
// }
import java.util.*;
public class TwoDarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }   
        System.out.println("Transpose of the following matrix is");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}