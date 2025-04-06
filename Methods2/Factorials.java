package Methods2;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n < 0) {
            return;
        }
        int result = factroial(n);
        System.out.println(result);
    }
    public static int factroial(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * i;
        }
        //System.out.println(ans);
        return ans;
    }
}
