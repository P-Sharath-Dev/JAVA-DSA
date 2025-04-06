package Methods2;

public class MethodsTwo {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;
        sum(a, b, c);
        System.out.println("a from main() :- " + a);
    }
    public static void sum(int a, int b, int c){
        a++;
        int sum = a + b + c;
        System.out.println("a from sum() :- " + a);
        System.out.println(sum);
    }
}
