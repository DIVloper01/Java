// import java.util.Scanner;

// /**
//  * fjoifh
//  */
// public class practice {
//     public static void CalculateSumAvg(int numbers[],int sum,int avg, Scanner sc,int size){
//         for(int i =0;i<numbers.length-1;i++){
//             System.out.print("Enter number: ");
//             numbers[i]=sc.nextInt();
//             sum= sum+numbers[i];
//             avg = sum/numbers.length;
//         }
//         System.out.println("The sum of the array is "+sum);
//         System.out.println("The average of the array is "+avg);
        
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         //taking size of the array as input
//         int size = sc.nextInt();
//         int numbers[]= new int [size];
//         int sum=0;
//         int avg=0;
//         CalculateSumAvg(numbers, sum, avg, sc,size);
//     }
    
// }

// import java.util.Calendar;
// import java.util.Scanner;
// public class practice {
//     public static void calculateFactorial(int n,int facto){
//         for(int i=n;i>=1;i--){
//             facto=facto*i;
//         }
//         System.out.print(facto);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int facto=1;
//         calculateFactorial(n, facto);
//     }
// }

import java.util.Scanner;

/**
 * practice
 */
/**
 * practice
 */
// public class practice {
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter string; ");
//         String S=sc.nextLine();
//         System.out.print("Enter start inedex: ");
//         int L=sc.nextInt();
//         System.out.print("Enter ending index: ");
//         int R=sc.nextInt();
//         StringBuilder sb=new StringBuilder(S);
//         StringBuilder sbr=new StringBuilder(sb.substring(L, R));
//         for(int i=0;i<sbr.length()/2;i++){
//             int front=i;
//             int back =sbr.length()-i-1;
//             char frontchar = sbr.charAt(front);
//             char backchar = sbr.charAt(back);
//             sbr.setCharAt(front, backchar);
//             sbr.setCharAt(back, frontchar);
//         }
//         //the reverse string 
//         System.out.println(sbr);


//     }
    
// }
/**
 * practice
 */
/**
 * practice
 */
// public class practice{
//     public static int PrintExpo(int n,int x,int expo){
//         for(int i=0;i<n;i++){
//             expo=expo*x;
//         }
//         System.out.println(expo);
//         return expo;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter x: ");
//         int x=sc.nextInt();
//         System.out.println("enter n: ");
//         int n=sc.nextInt();
//         int expo=1;
//         PrintExpo(n, x, expo);
//     }
// }
// import java.util.*;
// class practice{
//     public static void main(String[]args){
//         Scanner sc= new Scanner (System.in);
//         System.out.print("enter string: ");
//         String s=sc.nextLine();
//         StringBuilder sb= new StringBuilder(s);
//         for(int i=0;i<=sb.length()/2;i++){
//             int front=i;
//             int back=sb.length()-i-1;
//             char frontchar=sb.charAt(front);
//             char backchar=sb.charAt(back);
//             sb.setCharAt(front, backchar);
//             sb.setCharAt(back, frontchar);
//         }
//         System.out.print("Reverse of this string is: "+sb);
//     }
// }
/**
 * practice
 */
/**
 * practice
 */
import java.util.Scanner;

public class practice {
    
    public static boolean isPrime(int n) {
        // Special case for numbers less than 2
        if (n < 2) {
            return false;
        }
        
        // Check divisors from 2 up to n-1
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
