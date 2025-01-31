//FINDING SECOND LARGEST ELEMENT
// import java.util.Arrays;
// public class SecondLargest {
//     public static void main(String[] args) {
//         int arr[]={2,3,6,4,8};
//         int lar=arr[0];
//         int sec = arr[1];
//         for (int i = 0; i < arr.length; i++) {
//             if(lar<arr[i]){
//                 lar = arr[i];
//             }
//         }
//         for (int j = 0; j < arr.length; j++) {
//             if (sec <arr[j] && arr[j]< lar) {
//                 sec = arr[j];
//             }
            
//         }
//         // Arrays.sort(arr);
        
//         System.out.println(sec);
       

        
//     }
// }

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size");
        int size = sc.nextInt();
        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
