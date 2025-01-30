import java.util.Scanner;
public class revstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        StringBuilder strb = new StringBuilder(str);
        for(int i=0;i<strb.length()/2;i++){
            int front=i;
            int back= strb.length()-i-1;
            char frontchar=strb.charAt(front);
            char backchar = strb.charAt(back);
            strb.setCharAt(front, backchar);
            strb.setCharAt(back, frontchar);           
        }
        System.out.println(strb);
    }
}

