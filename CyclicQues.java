
public class CyclicQues {
    static int FindMissing(int arr[]){
        int i=0;
        while (i<arr.length) {
            int correctindex=arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }else{
                i++;
            } 
        }
        //to check the missing element
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index){
                return index;
            }
        }
        //case 2
        return arr.length;
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
            int arr[]={4,0,2,1};
            System.out.println(FindMissing(arr)); 
        }
    }
    
    
    
    