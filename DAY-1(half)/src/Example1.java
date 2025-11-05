
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        byte age = 25;
        short year =2025;
        int population = 1000000000;
        long distance = 1000000000;
        float CGPA = 7.67f;
        double height = 170.6;
        char grade = 'A';
        char grade2 = 65;
        boolean isStudent = true;
        System.out.println("age:" +age);
        System.out.println("year:" +year);
        System.out.println("population:" +population);
        System.out.println("distance:" +distance);
        System.out.println("CGPA:" +CGPA);
        System.out.println("hEIGHT:" +height);
        System.out.println("Grade:" +grade);
        System.out.println("Grade in Asci:" +grade2);
        System.out.println("Student:" +isStudent);
    
/*This Section Is all about the primitive datatypes, here I got familar with all the premitive datatypes and there 
ranges as well as why it is very important to declare wthin in there range, the reason for this is to keep all the 
operation's precise and the most accurate out for it all is the double because it can hold better precision values
*/

//Casting- morphing of the datatype of variable using another datatype
//EXPLICIT CASTING or TYPECASTING
/*When we modify the datatype of an [existing variable with an existing datatype] to print the value in range of another
 datatype*/

float pi = 3.142f;
int PI = (int) pi;
System.err.println("Value of pi:"+pi);
System.err.println("Value of PI:"+PI);

// IMPLICIT CASTING or TYPE PROMOTION

/*When we use the compiler itself to convert a smaller datatype into larger datatype without the need of explicit 
calling*/
// POSSIBLE TYPE PROMOTION WERE ALSO THOUGHT HERE

byte b = 10;
int i = b;
System.out.println("value of b is "+b);
System.out.println("value of i is "+i);


// it is not adviced to use the implicit casting because it will result in "Compile Time Error(CTE)"
//Non-Premitive Datatypes
/* these are derived datatypes which are use to store large values and the are also known as reference datatypes*/
//THE 3 MAIN NON PRIMITIVE DATATYPES
//1.String
/* they are a sequence of charecters and are used to store text in java usally used to store user input, output or 
  even filenames
 */
String nameString = "Adnan";
System.out.println("I AM "+nameString);
//2.Arrays
/*these are a group of elements with same datatype under the same name and the are used to store multiple values 
 and large amounts of data*/

 int[] array = new int[] {1,2,3,4,5};
 System.out.println("This is an ARRAY:" +Arrays.toString(array));
 //3.Classes
 /* A class is a blueprint of an object and an object is an instance of a class which is an instance of a class 
  * classes are used to define the structue and behaviour of a object they are also the building blocks of OOPs
  
  syntex: class myclass{
  
  }
 */
// there was also a comparision between the PRIMITIVE DATATYPES and NON-PRIMITIVE DATATYPES
/* 1. primitive datatypes are stored in stack[fast, fixed and small] where as the non-primitive datatypes are stored in heap[slow ,dynamic and large]
 * 2. primitives have a value and non-primitives have a reference
 * 3. primitives have predfined set of operations and non-primitives have methods defined for them 
*/
// the next section was about variable naming conventions
/*the very important once were
1.the variables are case sensitive [MYVARIABLE is different from myvariable]
2.they must begin with with a letter ,$ sign or underscore and can only cantain letters,numbers,$ sing and underscore_
valid=myvariable,my_name,_myname and $discount
invalid=2_name,my-name

then also learned the use of meaningful and discriptive variable names and why it is important to*/
/*remember some variable names such as int,double,class,private and more
which are called as reserved keywords 
these reserved keywords help us in debugging the code and also in maintaining it
  */
  
  // variable scope in java
  /*it was all about the variables having scopes that determine weather or not these variables that are declared can 
   * be accessed or not ,a variables scope is defined by opening and closing brackets{} which enclose the variable 
   * declaration
   * three types of scope in java
   * 1.Local Scope
   * 2.Block Scope
   * 3.GlobalScope
  */
    }

}