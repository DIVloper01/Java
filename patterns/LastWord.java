import java.util.Scanner;

public class LastWord {
    public int lengthOfLastWord(String s) {
        int  c= 0;
        int a=0;
     for(int i = s.length()-1;i>=0;i--){
        if(s.charAt(i) == ' ' && c!=0){
            break;
        }
        if(s.charAt(i)!= ' '){
            c=1;
            a++;
        }
     }  
     return a; 
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder fstr = new StringBuilder("");
        for (int i = str.length()-1; i > 0; i--) {
            if (str.charAt(str.length()-1)==' ') {
                continue;
            }
            if (str.charAt(i)!=' ') {
                fstr.append(str.charAt(i));
            }
            // if (str.charAt(i)==' ') {
            //     return;
            // }
        }
        System.out.println(fstr.length());

    }   
}
