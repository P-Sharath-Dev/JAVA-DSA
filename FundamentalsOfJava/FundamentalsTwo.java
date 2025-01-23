package FundementalsOfJava;

public class FundamentalsTwo {
    public static void main(String[] args) {
        // int avgScore = 342.5;
        // decimal
        // float
        float avg = 40.5f;
        System.out.println(avg);
        float avgScore = 342.58885558888f;  // 4 bytes, low pricision(means after decimal it will give approximate value. ex:- instead of 342.58885558888 it will give 342.58887), upto 6-7 digits, suffix f/F is must
        // double
        double avgScore2 = 342.58885558888; // 8 bytes, high pricision, upto 15 digits, D/d is optional
        System.out.println(avgScore);
        System.out.println(avgScore2);


        // how to store characters/char
        // '' single quotes
        int character = 'a'+1;
        System.out.println(character);
        char c = 'a'+1; // size: 2 bytes
        System.out.println(c);

        int a = 'a';
        System.out.println(a);// it will give 97 instead of a because a's ascii value is 97.

        // Boolean -> true/false
        boolean canVote = false;    // varies 1bit/1byte
        System.out.println(canVote);

        int x = -7;
        System.out.println(x);
    }
}
