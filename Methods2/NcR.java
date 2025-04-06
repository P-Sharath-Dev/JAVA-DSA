package Methods2;

import java.util.Scanner;

public class NcR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc. nextInt();

        sc.close();
        int nFact = factroial(n);
        int rFact = factroial(r);
        int nrFact = factroial(n - r);
        int ans = nFact / (rFact*nrFact);
        System.out.println(ans);

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
