public class bs {
    static int search(int arr[],int target,int s,int e){
         int mid= s+(e-s)/2;
         if(arr[mid]==target){
            return mid;
         }
        if (arr[mid]<target) {
            s=mid;
        }
        else{
            e = mid;
        }
         
        return search(arr, target, s, mid-1);
    }
     
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,12};
        int target = 12;
        System.out.println("element found at "+search(arr, target, 0, arr.length-1));
    }
}