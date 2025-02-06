// public class Method1 {
//     public static void PrintHello(){
//         System.out.println("Hello World");
//     }
//    public static void main(String[] args) {
//         PrintHello();   
//     }
    
// }

import java.util.Scanner;


public class Vowels {


    public static Boolean IsVowel(String str){
        boolean judge =true;
        for (int i = 0; i < str.length(); i++) {  
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
            str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
                judge = true;
            }else{
                judge = false;
            }
        }
       return judge;
    }
    public static Boolean CharVowel(char c){
        boolean judge =true;
            if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u') {
                judge = true;
            }else{
                judge = false;
            } 
       return judge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            if (CharVowel(st.charAt(i))) {
                continue;
            }else{
                System.out.print(st.charAt(i));
            }
        }
    }
    
}