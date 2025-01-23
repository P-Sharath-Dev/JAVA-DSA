package FundamentalsOfJava;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10; // here a is variable of int data type
        System.out.println(a);
        Integer i = 10; // here i is an Object
        System.out.println(i);
        System.out.println(i.MIN_VALUE);
        System.out.println(i.MAX_VALUE); 
        Double d = 2000.3; // d is an Object
        System.out.println(d.MAX_VALUE);

        String s = "hello world"; // Non-primitive
        System.out.println(s);
    }
}
