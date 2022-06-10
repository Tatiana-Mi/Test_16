package Test_15;

//exceptions

public class App1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Before try/catch");

        try {
            System.out.println("In try/catch before problem");
            int c = a/b;
            System.out.println("In try/catch after problem");

        } catch (ArithmeticException err){
            System.out.println("Error happens - in the catch block");
        }
        System.out.println("After try/catch - we are good!");

//        try {
//            int c = a/b;
//        } catch (ArithmeticException err){
//            System.out.println("Error happens - in the catch block");
//        }
    }
}
