 import java.util.Arrays;

 public class Cyclicsort {
     public static void main(String[] args) {
         int arr[]={2,5,3,1,6,4,7};
         int i=0;    
         while(i<arr.length){
             int correctindex=arr[i]-1;
             if(arr[i]!=arr[correctindex]){
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
             }else{     
                i++;
             }
         }       
        System.out.print(Arrays.toString(arr));
     }
    }