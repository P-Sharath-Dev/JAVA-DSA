package Methods2;

public class MethodOverloading {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum1 = sum(x, y);
        System.out.println("sum1 :- " + sum1);
        int sum2 = sum(x, y, 15);
        System.out.println("sum2 : - " + sum2);
        double sum3 = sum(4.9 , 5.09);
        System.out.println("sum3 :- " + sum3); 
        
    }

    public static int sum(int a, int b){
        int ans = a + b;
        return ans;
    }
    public static int sum(int a, int b, int c){
        int ans = a + b + c;
        return ans;
    }
    public static double sum(double a, double b){
        double ans = a + b;
        return ans;
    }
}
