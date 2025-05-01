import java.util.*;

public class AdvanceExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Enter the index from (0 - 4): ");
            int index = Integer.parseInt(sc.nextLine());

            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);

            System.out.print("Enter a number to divide 100 by: ");
            int divisor = Integer.parseInt(sc.nextLine());

            int result = 100 / divisor;
            System.out.println("100 / " + divisor + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range! Valid indices are 0 to 4.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("End of exception handling block.");
            sc.close();
        }

        System.out.println("Program continues...");
    }
}
