import java.util.*;
public class VarArgs {
    static int sum(int ...arr){
        int res = 0;
        for(int a: arr){
            
            res += a;
        }
        return res;
    }
    public static void main(String[] args) {
       
      System.out.println(sum(4,5,6,7,8,9,9));
      
        
    }
}