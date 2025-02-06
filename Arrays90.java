import java.util.Scanner;

public class Arrays90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]=temp;
            }
            for (int k = 0; k < arr.length; k++) {
                for (int l = 0;l < arr.length; l++) {
                    System.out.print(arr[l][k]+" ");
                }
                System.out.println();
            }
        }       

    }
}   
