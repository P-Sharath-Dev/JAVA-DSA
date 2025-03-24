package Operators;

import javax.sql.rowset.spi.SyncResolver;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators in Java");

        //Assignment Operator ( = )
        int i = 10;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);

        //Arithematic Operators (+, -, *, / , %)\

        int a = i + 1;
        System.out.println(a);
        System.out.println(100+10);  //110
        System.out.println(100-10);  //90
        System.out.println(100*10);  //1000
        System.out.println(100/10);  //10
        System.out.println(100%10);  //0

        //multiple operators in one statement (Precdence)
        int x = 8, y = 7, z = 6;
        System.out.println(x/y);
        System.out.println(x/(y+z)+3*3/3);

        //Type Casting
        // Implicit/Automatic (Widening)
        short age = 20;
        double age2 = 20;
        age2 = age;
        System.out.println(age2);

        // Explicit/Manual (Narrowing)
        age = (short)age2;
        System.out.println(age);

        long l = 100;
        int in = (int)l;
        
        short currentYear = 2025;
        byte pAge = 33;
        short birthYear = (short)(currentYear - pAge); //any operation done on short, byte is saved as int in Java
                                                       //any operation done on float is saved as double in Java
        System.out.println(birthYear);

        int num = 1;
        long long1 = 103940294904049l;
        long result = num + long1;
        int result1 = num + (int)long1; //here data will loss
        System.out.println(result);
        System.err.println(result1);
    }

}
