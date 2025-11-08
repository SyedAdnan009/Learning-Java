import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("Thank you!");
        scanner.close();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // is used to skip the current iteration of a loop and execute the next iteration of the loop
            }
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                break;  //this is the statement the is use to terminate the execution of statement prematurely
            }
            System.out.println(i);
        }
    }
}