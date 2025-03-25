package Operators2;

public class Operators {
    public static void main(String[] args) {
        //unary operators(+, -, ++, --, !)
        int a = 10;
        // System.out.println(a);
        // a = a+1;
        // a += 1;
        // a++; //(post increment)
        // System.out.println(a++);
        // System.out.println(a);
        // System.out.println(++a); //(pre - increment)

        //not operator (!)
        boolean b = true;
        // System.out.println(b); //true
        // System.out.println(!b); //false
        // System.out.println(!!b); //true

        //Comparision Operators (result will be boolean)
        System.out.println("***Comparision Operators***");
        int num1 = 10;
        int num2 = 20;
        // System.out.println(num1 == num2); //false
        // System.out.println(num1 != num2); //true
        // System.out.println(num1 <= num2); //true
        // System.out.println(num1 >= num2); //false
        // System.out.println(num1 < num2);  //true
        // System.out.println(num1 > num2);  //false

        //Logical Operators (&&, ||)
        System.out.println("***Logical Operators***");
        int x = 5;
        int y = 10;
        int z = 15;

        boolean isXGreatest = (x > y && x > y);
        boolean isYGreatest = (y > x && y > z);
        boolean isZGreatest = (z > x && z > y);

        // System.out.println(isXGreatest);
        // System.out.println(isYGreatest);
        // System.out.println(isZGreatest);

        //Bitwise Operators (&, |, ^, ~, >>, <<, >>>, ) 
        System.out.println("***Bitwise Operators***");
        int aa = 5;                     // 0 1 0 1
        int bb = 7;                     // 0 1 1 1
                                       // ----------
        System.out.println(aa & bb);   //  0 1 0 1   --> (o/p is 5). follow truth table. we get 1 only when all inputs are 1.
                                       // ----------

        int cc = 3;  // 0 0 1 1
        // System.out.println(aa & cc); // o/p : -  0 0 0 1.  means 1

        // System.out.println(aa | cc); // o/p :- 0 1 1 1;   means 7

        // << (left shift),  >>(right shift), >>> (unsigned right shift)
        System.out.println( 4 << 1);   //8
        System.out.println( 4 >> 1);   //2
        System.out.println( 4 >>> 1);  //2
        System.out.println( -4 << 1);  //-8
        System.out.println( -4 >> 1);  //4
        System.out.println( -4 >>> 1); //2nd laggest number (2147483646)
        System.out.println(Integer.MAX_VALUE); // 2147483647 largest number
    }
}
