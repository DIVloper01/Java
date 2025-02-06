import java.util.Scanner;

public class VarArgs {
    public static int sum(int... nums){
        int total = 0;
        for (int numbers:nums) {
            total+=numbers;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers. with spaces");
        String input = sc.nextLine();
        String inputArray[] = input.split(" ");
        int nums[] = new int[inputArray.length];
        for (int i = 0; i < (inputArray.length); i++) {
            nums[i] = Integer.parseInt(inputArray[i]);
        }
        int result = sum(nums);
        System.out.println("Sum will be "+result);
    }
}
