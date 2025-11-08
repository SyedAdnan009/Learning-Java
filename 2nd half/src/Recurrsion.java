public class Recurrsion {
     
    public static void main(String[] args) {
        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5 is: " + factorialOf5);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    // Variable arguments
/*printNumbers();
        printNumbers(5);
        printNumbers(1, 2, 3, 4, 5);
    }

    public static void printNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
 */
}
