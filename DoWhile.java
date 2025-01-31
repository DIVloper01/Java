import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cnt = 0;

        do {
            n = sc.nextInt();
            cnt++;

        } while (n < 0);
        System.out.println(n+" Number entered successfully.");
    }
}