public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("This block always executes because this is finally");
        }

        System.out.println("Program continues after exception handling.");
    }
}
