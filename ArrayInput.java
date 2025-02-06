import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m =sc.nextInt();
        System.out.print("Enter Columns: ");
        int n =sc.nextInt();
        int arr[][]= new int[m][n]; 
        for (int i = 1; i <= m; i++) {
            for(int  j = 1 ; j <= n ; j++){
                arr[i][j] = sc.nextInt();
            }            
        }
        for (int i = 0; i <= m; i++) {
            for(int  j = 0 ; j <= n ; j++){
                System.out.print(arr[i][j]+" ");  
            }            
            System.out.println();
        }
        

    }
}
