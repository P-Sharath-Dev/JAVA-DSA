package FundamentalsOfJava;

public class Literals {
    public static void main(String[] args) {

        //Literals            literals means fixed values , a particular value is fixed for something. like 97 is for a in ascii like that.  
        int a = 10;
        System.out.println(a);

        int b = 0b1010; // b is storing binary value of 10. here 0b or 0B both will work.
        System.out.println(b);

        //hex
        int hex = 0x64; // hex representaiton. x/X anyone can be used. 0x64 means 100 in decimal
        System.out.println(hex);
        //octal
        int oct = 064; // octal representaiton. no special character like x or b. only 0 in front means octal
        System.out.println(oct);

        int x = 'a';
        System.out.println(x);
        char ch = 98;
        System.out.println(ch);

        char unicode = '\u0394';
        System.out.println(unicode);
    }
}
