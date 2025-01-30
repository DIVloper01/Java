// import java.util.Scanner;


// public class practice1{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         //CREATING THE ARRAY
//         int arr[][]={
//             {1,5,7,9,10,11},
//             {6,10,12,13,20,21},
//             {9,25,29,30,32,41},
//             {15,55,59,63,68,70},
//             {40,70,79,81,95,105}
//         };

//         //PRINTING THE OUTPUT
//         for(int i=0;i<5;i++){
//             for(int j=0;j<6;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }


//         //TO GET THE SPIRAL MATRIX
//         System.out.println("required output: ");
        
//         for(int j=0;j<6;j++){
//             int i=0;
//             System.out.print(arr[i][j]+" ");
//         }   
        
//         for(int i=1;i<5;i++){
//             int j=5;
//             System.out.print(arr[i][j]+" ");
//         }
//         for(int j=4;j>=0;j--){
//             int i=4;
//             System.out.print(arr[i][j]+" ");
//         }
//         for(int i=3;i>=1;i--){
//             int j=0;
//             System.out.print(arr[i][j]+" ");
//         }
//         for(int j=1;j<=4;j++){
//             int i=1;
//             System.out.print(arr[i][j]+" ");
//         }
//         for(int i=2;i<=3;i++){
//             int j=4;
//             System.out.print(arr[i][j]+" ");
//         }
//         for(int j=3;j>=1;j--){
//             int i=3;
//             System.out.print(arr[i][j]+" ");
//         }
//         for(int j=1;j<=3;j++){
//             int i=2;
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.print(arr[2][2]);

//     }   
//

import java.util.Scanner;

/**
 * practice1
 */
public class practice1 {
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
        



    }
}
    
