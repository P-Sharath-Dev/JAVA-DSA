package Methods2;

public class CallStack {
    public static void main(String[] args) {
        System.out.println("inside main()");
        a();
        System.out.println("exiting main()");
    }
    public static void a(){
        b();
        System.out.println("inside a()");
    }
    public static void b(){
        System.out.println("inside b()");
    }
}
