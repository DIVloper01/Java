//CALCULATOR USING SWITCH
import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mult= a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println("enter operation: ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println(add);
                break;
            case "-":
                System.out.println(sub);
                break;
            case "/":
                System.out.println(div);
                break;
            case "%":
                System.out.println(rem);
            case "*":
                System.out.println(mult);
                break;
            default:
                System.out.println("maa chuda");
                break;
        }
    }
}
