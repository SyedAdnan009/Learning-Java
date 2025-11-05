public class ConsoleOutput {
    //first coding exercise from the course
    public static void main(String[] args) {
        int number = 42;
        double price = 12.99;
        boolean isAvailable = true;
        char grade = 'A';
        String name = "Alice";

        // Use print and println methods here
        System.out.print("Number: ");
        System.out.println(number);
        System.out.print("Price: ");
        System.out.println(price);
        System.out.print("Availability: ");
        System.out.println(isAvailable);
        System.out.print("Grade: ");
        System.out.println(grade);
        System.out.print("Name: ");
        System.out.println(name);

        // Use printf method here
        System.out.printf("Formatted Output: Name: %s, Number: %d, Price: %.2f, Availability: %b, Grade: %c", name,number,price,isAvailable,grade);
    }
}