import java.util.Scanner;


public class spiralmatrix {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value m: ");
        int n= sc.nextInt();        
        System.out.print("Enter value n: ");
        int m= sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // for(int i=0;i<m;i++)n
        //     for(int j=0;j<n;j++){
        //         System.out.print( arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=m-1;
        while (rowstart<=rowend && colstart<=colend) {
            for(int i=colstart;i<=colend;i++){
                System.out.print( arr[rowstart][i]+" ");
            } rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                System.out.print( arr[i][colend]+" ");
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                System.out.print(arr[rowend][i]+" ");
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                System.out.print(arr[i][colstart]+" ");
            } 
            colstart++;
        }
    }
}