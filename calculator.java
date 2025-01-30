import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mult= a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println("enter operation: ");
        String op = sc.next();
        if (op.equals("+")) {
            System.out.println(add);
        } else if (op.equals("-")) {
            System.out.println(sub);
        } else if(op.equals("/")){
            System.out.println(div);
        } else if (op.equals("%")){
            System.out.println(rem);
        } else if (op.equals("*")){
            System.out.println(mult);
        } else{
            System.out.println("maa chuda");
        }
    }
}
