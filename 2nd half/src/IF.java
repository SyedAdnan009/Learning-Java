public class IF{
    public static void main(String[] args) {
        //The If else Loop- a loop that will excute two different staments based on the conditions [true or false] 
        /*this code is a simple use of the if else statement */
        int num = 5;
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        // this a bit more complex problem that is a real world oriented
     int age = 25;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
//Nested if - it is the same as the if else stament but has a if else inside an if else statment and this is what is 
/*called as the nested if always the inside loop will be executed first */
if (age >= 18) {
            if (age >= 21) {
                System.out.println("You can legally drink alcohol.");
            } else {
                System.out.println("You can vote, but not drink alcohol.");
            }
        } else {
            System.out.println("You are not old enough to vote or drink alcohol.");
        }

        //IF ELSE Ladder - this the the same as nested if but with include of another 
        //if-else loop that looks like a ladder it is usefull because the ladder is used in many cases 
        //where we have to check multiple condition
         int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("y is greater than x");
        } else {
            System.out.println("x and y are equal");
        }

        //practice question - 
        int u = 5;
        if (u > 10) {
            System.out.println("u is greater than 10");
        } else {
            System.out.println("u is not greater than 10");
        }
}
}
