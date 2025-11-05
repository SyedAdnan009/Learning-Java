public class Example3 {
    //all about writing to the console
    public static void main(String[] args) {
        System.out.println("Hello World!!!!!!!!!");
        System.out.println("Hello World!!!!!!!!!");
        //with variable
        int age = 20;
        System.out.println(age);
        System.out.print("Hello");//difference between print and println
        System.out.println(" World!!!!!");
        //printf method
        //syntax : System.out.printf("format string", list of arguments);
        /*%d is a placeholder integer
         * %s is a placeholder string
         * %f is a placefolder for floating numbers
         */
        // the format string writting to console
        String name="Adnan";
        System.out.printf("My Name is %s and I am %d years old\n",name,age);
        //printf is also good to use while printing only required amount of decimal numbers on console
        double price=12.8765;
        System.out.printf("The price is %.2f\n",price);
        //also very good in setting the format of a page
        System.out.printf("[%10d]",5);
        //this helped me understant that the is printf in java too like there is in c
    }
    
}
