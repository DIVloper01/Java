// import java.util.Scanner;

// public class bits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         String binaryString = Integer.toBinaryString(n);
//         for(int i=0;i<binaryString.length();i++){
        
//         }
//     }
// }

import java.util.Scanner;

/**
 * bits
 */
public class bits {
    public static void DecimalToBinary (int n){
        String binaryString=Integer.toBinaryString(n);
        System.out.println(binaryString);
    }
    public static void BinaryToDecimal(String s){
        int decimal=Integer.parseInt(s,2);
        System.out.println(decimal);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        // System.out.print("enter binary number: ");
        // String s=sc.nextLine();
        DecimalToBinary(n);
        // BinaryToDecimal(s);
    }
    
    
}


