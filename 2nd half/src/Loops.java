public class Loops {
    public static void main(String[] args) {
    //for- this loop has the syntax of (initialization ;condition; increment ,decrement)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
// while - this is also a loop but theone that execute after checking the condition
  int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
// do-while - this is a exit controled loop that will execute the statement once before checking the condition
int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

    }
}
