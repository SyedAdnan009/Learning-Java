import java.util.Scanner;
public class ReadingConsoleInput {
    public static void main(String[] args) {
    //initializing a variable with scanner
    //syntax: Scanner variable_name=new Scanner(System.in)
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your Name:");
    String name = input.nextLine();
    System.out.println("Hello "+name);
    //after declaring the scanner we initialize a string variable then use nextline();
    System.out.print("Enter your Number:");
    int number = input.nextInt();
    System.out.println("Your Number:"+number);
    
    System.out.print("Enter your Number:");
    double num = input.nextDouble();
    System.out.println("your number is "+num);
    input.close();
    
    //same goes for all the other varialbles types but we need to keep changing the nextline,nextInt,nextdouble
    //,nextchar etc
}
}