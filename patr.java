import java.util.Scanner;

public class patr {
    public static int Power(int x,int n){
        int result=1;
        for(int i=0;i<n;i++){
            result=result*x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x=sc.nextInt();
        System.out.print("n: ");
        int n=sc.nextInt();
        System.out.println("the power will be "+Power(x, n));



    }
}


  
