import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class rough {
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
    static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    } 
    public static void main(String[] args) {
        int arr[]={0,3,7,2,5,8,4,6,0,1};
        sort(arr);
        
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i+1]==arr[i]+1){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count+1);
        
        
    }
    
}