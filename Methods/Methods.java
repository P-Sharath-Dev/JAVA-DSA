package Methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println("***Methods***");
        //customerDetails(); // method call
        customerDetails("Abc", "01/01/1999", 99999999999L); // arguments
        int ans = squareOfNumber(4);
        System.out.println("square is " + ans);
    }
    // public static void customerDetails(){
    //     System.out.println("Name :- Abc");
    //     System.out.println("DOB :- 10/10/10");
    //     System.out.println("Account number :- 99999999999");
    // }

    //method with parameters.
    public static void customerDetails(String name, String dob, long accountNumber){  // parameters
        System.out.println("Name :- " + name);
        System.out.println("DOB :- " + dob);
        System.out.println("Account number :- " + accountNumber);
    }

    //method with return type;
    public static int squareOfNumber(int num){
        int square = num * num;
        return square;
    }
}
