package Methods2;
import java.util.*;
public class PrintAllPrimeNos {

    public static void printPrime(int n){
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.println(i + " is a PRIME ");
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printPrime(N);
        sc.close();
    }
}
