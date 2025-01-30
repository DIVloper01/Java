// import java.util.Arrays;
// public class insertion {
//     static void swap(int[]arr,int first,int second){
//         int temp=arr[first];
//         arr[first]= arr[second];
//         arr[second]=temp;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,1,3,4,5};
//         for (int i = 0; i < arr.length-1; i++) {
//             for (int j = i+1; j > 0; j--) {
//                 if(arr[j]<arr[j-1]){
//                     swap(arr, j, j-1);
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
        
//     }

// }
/**
 * insertion
 */
public class insertion {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,3,5,4};
        int count =0;
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {   
            if (arr[i+1]==arr[i]+1) {
                count++;
                flag=false;
            }  
            if (flag=true) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j]==arr[j+1]){
                        count++;
                    }
                }
            }
            else{
                break;
            }
        }
        System.out.println(count+1);
    }  
}