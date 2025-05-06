package Strings;

public class IntroToStrings {
    public static void main(String[] args) {

        int arr[] = new int[5];
        System.out.println("arr[] : " + arr);
        //Character array
        char chArr[] = {'a', 'b', 'c'};

        char chArr1[] = new char[5];
        
        char[] chArr3 = {'a', 'b', 'c'};

        System.out.println("chArr[] : " + chArr);
        System.out.println( chArr);//here chArr is internally converted to string and combines all elements & gives as single string. ex : {'a','b'} as ab
        System.out.println("chArr1[] : " + chArr1);// here chArr1 is concatinated with string so it is treated as object an call toString() internally
                                                    // then we get [C@5674cd4d. here("chArr[] : " + chArr) is same as (chArr.toString());
        System.out.println( chArr3.toString()); // o/p:-  [C@63961c42
        //Declaring and initializing String

        //1. using String Literals
        String name = "Deva";
        System.out.println("Name :- " + name);

        //2. using new keyword
        String str1 = new String("Coding");
        System.out.println(str1);

        char ch[] = {'a', 'b', 'c', 'd', 'e'};

        byte b[] = {97, 98, 99};
        
        String s1 = new String(ch); // passing ch[] array // o/p => abcde 

        String s2 = new String("Hello");// passing string literals

        String s3 = new String(b); // passing b[] array // o/p => abc

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);


            //methods in Strings
        //equals : used to compare two Strings and retruns boolean
        String strng1 = new String("Coding Ninjas");
        String strng2 = new String(ch);
        System.out.println(strng1.equals(strng2));

        //length method : returns length of string
        System.out.println(strng1.length());
        System.out.println("hello".length()); // o/p :- 5

        // charAt : retruns character at specified index in string 
        System.out.println(strng1.charAt(5)); //gets error(String out of bounds) if the given index is greater than length of the string or less than 0
        System.out.println("Hello".charAt(3));

        //trim : removes spaces from starting and ending((front and last). not between the string.
        String strr = new String("   Coding Ninjas    "); 
        System.out.println("after trimmed : " + strr.trim()); // o/p : Happy coding


        //replace : it search for given value and replace it with provided value but it is not saved. to save it assing it to another variable
        System.out.println(strr.replace('n', '$'));// o/p :- Codi$g Ni$jas

        //upper/lower : converts string to lower or upper case;
        System.out.println("lower case : " + strr.toLowerCase()); //o/p : coding ninjas
        System.out.println("UPPER CASE : " + strr.toUpperCase());

        //substring : it returns partial string from given starting index to ending index
        String strr1 = new String("HelloWorld");
        System.out.println(strr1.substring(3)); //substring with starting index
        System.out.println(strr1.substring(0, 5 )); //substring with starting and ending index. end is excluded 
                                                                        // means starts from begining index to till endIndex-1;


        //contains : to check if substring is present in string
        System.out.println(strr1.contains("Wor"));
        System.out.println();
    }
}
