// import java.util.Scanner;

// public class pract3 {
//  public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter marks: ");
//         int n=sc.nextInt();
//         if(n>= 90){
//             System.out.println("Grade A");
//         }
//         else if(n>= 75){
//             System.out.println("Grade B");
//         }
//         else if(n>= 50){
//             System.out.println("Grade E");
//         }else{
//             System.out.println("RE APPEAR TRY AGAIN");
//         }

//  }   
// }
// import java.util.Scanner;

// public class pract3 {
//  public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No. ");
//         int n=sc.nextInt();
//         if (n>0 && n%5 == 0) {
//             System.out.println("Yes it is");
//         }else{
//             System.out.println("No its not");   
//         }
        

//  }   
// }
import java.util.Scanner;

public class pract3 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. ");
        int n=sc.nextInt();
       switch (n) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        
        case 7:
            System.out.println("Sunday");
            break;
        
        default:
            System.out.println("Din ginna band kar tu Single hi marega!");
            break;
       }
        
sc.close();
 }   
}
