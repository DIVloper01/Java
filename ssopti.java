 import java.util.Arrays;

 class ssopti {
     public static  void main(String args[]){
        int arr[]={5,3,4,1,2};
         for (int i = 0; i < arr.length; i++) {
             for (int j = i+1; j < arr.length; j++) {
                 if(arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
        }
         System.out.print(Arrays.toString(arr));
     }
 }

 
 

// import java.util.Arrays;
// import java.util.Scanner;

/**
 * ss opti
 */
// public class ssopti {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[]=new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i]=sc.nextInt();
//         }
//         for (int i = 0; i < n-1; i++) {
//             for (int j = i+1; j >0 ; j--) {
//                 if(arr[j]<arr[j-1]){
//                     int val=arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=val;
//                 }
//             }
//         }
//         System.out.print(Arrays.toString(arr));
//     }
    
// }

