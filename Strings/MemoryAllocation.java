package Strings;

public class MemoryAllocation {
    public static void main(String[] args) {

        //Creating String using String Literals
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";
        
        //Printing addresses of Strings s1, s2, s3
        System.out.println("s1 : " + System.identityHashCode(s1));   //s1 and s2 will have same address
        System.out.println("s2 : " + System.identityHashCode(s2));   // and 
        System.out.println("s3 : " + System.identityHashCode(s3));   // s3 will have different address

        //comparing literals using (==)
        System.out.println(s1 == s2);  // == means it checks the reference not the value
        System.out.println(s1 == s3);
        System.out.println(s3 == s1);
        
        //Creating String using String Literals
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = new String("java");
        
        //Printing addresses of Strings s1, s2, s3
        System.out.println("str1 : " + System.identityHashCode(str1)); // both str1 and str2 will have different addresses means
        System.out.println("str2 : " + System.identityHashCode(str2)); // eventhough both have same values, both are two different objects 
        System.out.println("str3 : " + System.identityHashCode(str3)); // both are pointing to two different memory locations
        
        //comparing Strings with new keyword using (==)
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str3 == str1);
        
        //comparing using equals();
        System.out.println(s1.equals(str1)); // true, coz equals() checks the value not the reference
        
        //Strings are immutable
        String s4 = "java";
        System.out.println("s4 : " + System.identityHashCode(s4)); 
        System.out.println("s4 :- " + s4);
        s4 = s4 + " is ";
        System.out.println("updated s4 : " + System.identityHashCode(s4));
        System.out.println("s4 :- " + s4);
        s4 = s4 + " fun";
        System.out.println("updated s4 again : " + System.identityHashCode(s4));
        System.out.println("s4 :- " + s4);

        //Arrays are mutable

        char[] ch = {'a', 'b', 'c'};
        System.out.println(ch);
        System.out.println(ch.toString()); // prints address

        ch[1] = 's';
        System.out.println(ch);
        System.out.println(ch.toString());
    
    }    
}
