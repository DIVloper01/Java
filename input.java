import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name: ");
        String a = sc.next();
        System.out.println("Enter roll no: ");
        int b = sc.nextInt();
        System.out.println("Enter field of interest: ");
        String c = sc.next();
        System.out.println("hey my name is "+a+ "my roll number is " +b+ "my field of interest is "+c);
    }

    
}


