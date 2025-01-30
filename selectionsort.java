import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.print("enter size: ");
        int arr[]= {4,3,5,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));        
    }

    static void selection(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int maxindex= getMaxindex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }

    static int getMaxindex(int arr[],int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;        
    }
}
