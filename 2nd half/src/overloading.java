public class overloading {
    public static void main(String[] args) {
        System.out.println(add(1, 2)); // Prints 3
        System.out.println(add(1.0, 2.0)); // Prints 3.0
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
    //pass by value
      /*   public static void main(String[] args) {
        int x = 10;
        System.out.println("Before calling the method, x = " + x);
        changeValue(x);
        System.out.println("After calling the method, x = " + x);
    }

    public static void changeValue(int num) {
        num = num + 10;
        System.out.println("Inside the method, num = " + num);
    }
}*/
// pass by refernce
/*public class Example7 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("Before calling the method, numbers[0] = " + numbers[0]);
        changeArray(numbers);
        System.out.println("After calling the method, numbers[0] = " + numbers[0]);
    }

    public static void changeArray(int[] array) {
        array[0] = array[0] + 10;
        System.out.println("Inside the method, array[0] = " + array[0]);
    }
}
 */
// var args