// import java.util.Scanner;

// public class p1 {
//     public static void main(String[] args) {
//         boolean Isprime = true;
//         for(int i = 2; i<= 100;i++){
//             for (int j = 2; j < Math.sqrt(j); j++) {
//                if(i%j == 0){
//                     Isprime = false;
//                     break;
//                 }
//             }if (Isprime) {
//                 System.out.println(i);
//              }
//         }
//     }
// }

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. ");
        int n = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        int a =0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
    }

    
}