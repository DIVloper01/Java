import java.util.Scanner;
//represent pizza size 
//allow user to select size by entering the name of pizza
// Represent pizza size 
// allow user to select size by typing name of size 
import java.util.Scanner;

enum Pizza{
SMALL,MEDIUM,REGULAR,LARGE
}

public class PizzaProb {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Pizza Size: ");
    try {
     Pizza size=Pizza.valueOf(sc.nextLine().toUpperCase());
     System.out.println("You ordered a "+ size + " Pizza.");   
    }catch(IllegalArgumentException e){
System.out.println("Invalid sizze. Choose a correct size!");
    }

    sc.close();
   

    }
}