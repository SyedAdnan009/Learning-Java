public class operators{
    // Opearators
    /*here i learned all about the different types operators which are
    1.arithematic operators that are +,-,/,*,% 
    2.comparision operators that are ==,!=,>,<
    3. Logical Operators that are &&,|| and !
    4. Assignment Operators and short hand assignment operators that are 
    = is the assignment operator where as x+=3 is a shorthand operator which is equivalent to x=x+3 there are mainly mixes of
     = and all arithematic operators [shorthand operators are +=,-+,*=,/=] we can also do this with a string variable or any 
     other datatype too
     which can be like name +="doe" a name with doe in it will be specified*/
     // then learned about the operator presidence [PEMDAS-abbrivation]



    public static void main(String[] args) {
        //ARITHEMETIC OPERATORS
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = b / a;
        int g = b % a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //COMPARISION OPERATORS
        //==,>=,<=,<,>,!= 
         int x = 5;
         int y = 5;

        System.out.println(x == y);
        System.out.println(x != y);
        
        int a1 = 10;
        int b1 = 5;
        System.out.println(a1 > b1);
        System.out.println(a1 < b1);

        int c1 = 10;
        int d1 = 10;
        System.out.println(c1 >= d1);

        //LOGICAL OPERATORS
        //AND,OR and NOT
        System.out.println(x > 0 && y > 0);
        int x1 = -5;
        int y1 = 10;
        System.out.println(x1 > 0 || y1 > 0);

        int x2 = -5;
        System.out.println(!(x2 > 0));
        // Shorthand assignment operator
         int x3 = 5;
        System.out.println(x3);
        x3 -= 3;
        System.out.println(x3);
        x3 *= 3;
        System.out.println(x3);
        x3 /= 3;
        System.out.println(x3);

        String name = "John";
        name += " Doe";
        System.out.println(name);

        double num = 3.14;
        num *= 2;
        System.out.println(num);

    //use of all the operator in real 
    int x4 = 5 + 3 * 2;
    System.out.println(x4);

    int x5 = (2 + 3) * 4;//use of() to skip the precidence to the 
    System.out.println(x5);
    int result = (x + y) * x5;
    System.out.println(result);
    int result1 = (2 + (3 * 4)) - (6 / 2);
    System.out.println(result1);
    /* then the session continues to the part of avoiding mistakes in writing codes and then keeping the diciplene
     * of writting code so that others understand without the use extar operations 
    */


    }
}
    
