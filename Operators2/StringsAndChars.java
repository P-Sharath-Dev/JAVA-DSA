package Operators2;

public class StringsAndChars {
    public static void main(String[] args) {
        //concatinating
        String firstname = "abc";
        String lastname = "def";
        System.out.println(firstname + " " + lastname);

        char c1 = 'a';
        System.out.println(c1);
        char c2 = 'b';
        System.out.println(c2);
        System.out.println(c1 + c2); // we cant add two chars bcoz they will convet to ascii value and concatinated
                                     // now a value is 97 and b value is 98. now c1+c2 => 97+98 = 195
    }
}
