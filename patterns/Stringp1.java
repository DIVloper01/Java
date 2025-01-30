// import java.util.Scanner;

// public class Stringp1 {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter size: ");
//         int n= sc.nextInt();
//         sc.nextLine();
//         String arr[]= new String[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextLine();
//         }
//         String result=arr[0];
//         for(int i=0;i<arr.length;i++){
//             while(arr[i].indexOf(result)!=0){
//                 result=result.substring(0,result.length()-1);
//                 if(result.isEmpty()){
//                     break;
//                 }
//             }
//         }
//         if(result.isEmpty()){
//             System.out.print("the substring has ntg common");
//         }else{
//             System.out.println("the common substring is: "+ result);
//         }

//     }
    
// }

import java.util.Scanner;

public class Stringp1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int j=0;
        while (j<t) {
            System.out.println("enter length: ");
            int n=sc.nextInt();
            System.out.println("enter string: ");
            String s= sc.next(); 
            int count=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    count++;
                }
            }
            System.out.println("total no of consecutive strings are: "+ count);
            j++;
        }
    }
    
}