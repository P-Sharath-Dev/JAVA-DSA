package Strings;

import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        String str = "Happpppyyy Coding";
        //index :     0123456789 ....15;

        //indexOf : returns index of first occurance of given character in the string. returns -1 if not found;

        System.out.println(str.indexOf('a')); //index of i is 9 so o/p is 1
        System.out.println(str.indexOf('z')); //index of i is 9 so o/p is -1
        System.out.println(str.indexOf('y', 10)); // starting from index (here index is 1) returns first occurrence of given character in string
                                                            // o/p : -1 b'coz starting from index 10 there is no 'y'

        //lastIndexOf() : retruns last occurance of given character. returns -1 if not found;
        System.out.println(str.lastIndexOf('y')); //o/p : 9 . last occurance of 'y' is at index 9;
        System.out.println(str.lastIndexOf("yy"));// o/p : 8 b'coz last occurance of "yy" in str starts from index 8
        System.out.println(str.lastIndexOf("world")); //o/p : -1 b'coz "world" is not there in str
        System.out.println(str.lastIndexOf("Coding")); //o/p : 11

        //compareTo : compares two strings
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "hellow";

        System.out.println(s1.compareTo(s2)); // o/p : -32
        System.out.println(s2.compareTo(s1)); //o/p : 32
        System.out.println(s2.compareTo(s3)); //o/p : -1
        System.out.println(s3.compareTo(s2)); //o/p : 1

        

        //*********************taking user input at run time
        

        //nextLine()
        System.out.println("taking i/p using nextLine()");
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine(); //if input is "Hello World" o/p will also be "Hello World" only.

        
        System.out.println("input using nextLine() : " + input1);

        //next() : //it takes input till it finds space. if space is there then from space it stops taking input.
        
        System.out.println("taking i/p using next()");
        String input2 = sc.next(); //if input is "Hello World" o/p will be "Hello" only
        System.out.println("input using next() : " + input2);

        //if i want to take input only one character which first character then
        char ch = input2.charAt(0);
        System.out.println("character at 0-index in input2 is : " + ch);
        
        
    }
}
