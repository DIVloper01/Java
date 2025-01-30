
// //BUBBLE SORT
import java.util.Scanner;

/**
 * Sorting
 */
public class Sorting {
    public static void printarr(int arr[]){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
        System.out.println();
    }
    public static void main(String[]args){
        //taking size as input
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter elements to be sorted: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int val=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=val;
                }
            }
        }
        printarr(arr);
    }
    
}
//SELECTION SORT
// public class Sorting {
    // public static void printarray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();        
    // }
//     public static void main(String[] args) {
//         int arr[]={3,8,7,1};
//         for(int i=0;i<arr.length-1;i++){
//             int smaller=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smaller]>arr[j]){
//                    smaller=j;
//                 }   
//             }
//             int temp=arr[smaller];
//                 arr[smaller]=arr[i];
//                 arr[i]=temp;  
//         }
//         printarray(arr);
//     }    
// }
//INSERTION SORT
// public class Sorting {
//     public static void printarray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();        
//     }
//     public static void main(String[] args) {
//         int arr[]={3,8,6,1,2};
//         for(int i=1;i<arr.length;i++){
//             int current=arr[i];
//             int j=i-1;
//             while(j>=0 && current < arr[j]){
//                  arr[j+1]=arr[j];
//                  j--;
//             }
//             arr[j+1]=current;
//         }
//         printarray(arr);        
//     }  
// }
