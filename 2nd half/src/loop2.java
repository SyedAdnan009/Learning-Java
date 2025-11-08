import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);
        int age = -1;
        while (age <= 0) {
            System.out.print("Enter your age: ");
            age = input.nextInt();
            if (age <= 0) {
                System.out.println("Invalid age. Please enter a positive value.");
            }
        }
        input.close();
    }  
}  
// this is my most liked code here i just like the fact that we can use this type of loops to avoid taking 
//the wrong input from the user this program uses the while loop that uses a preinitialized integer that 
//is called as age which is -1 and this age because it must be only a positive number until the user gives only 
//positive number as input  
