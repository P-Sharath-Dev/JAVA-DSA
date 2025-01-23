package PrimitiveDatatypes;

public class PrimitiveDatatypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127; // Size: 1 byte (8 bits), Range: -128 to 127
        short shortValue = 32000; // Size: 2 bytes (16 bits), Range: -32,768 to 32,767
        int intValue = 2147483647; // Size: 4 bytes (32 bits), Range: -2,147,483,648 to 2,147,483,647
        long longValue = 9223372036854775807L; // Size: 8 bytes (64 bits), Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // Floating-point types
        float floatValue = 3.14F; // Size: 4 bytes (32 bits), Range: ~1.4E-45 to ~3.4E+38
        double doubleValue = 3.141592653589793; // Size: 8 bytes (64 bits), Range: ~4.9E-324 to ~1.7E+308

        /*
        for long type and float type if l/L and f/F is not mentioned the compiler will consider it as int type and gives error
            error: integer number too large: 9223372036854775807
                long longValue = 9223372036854775807; // Missing 'L' suffix
        */
        // Character type
        char charValue = 'A'; // Size: 2 bytes (16 bits), Range: 0 to 65,535 (Unicode values)

        // Boolean type
        boolean booleanValue = true; // Size: Depends on JVM, only two values: true or false

        // Display the values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}