public class methods {
    //Methods: syntax: access modifier returnType methodName(parameter list){
    //                                               method body                }
    /*this is a function that is encapsulated set of instruction that can be called anywhere inside a class
     but still a method is a part of function or a class meaning [Function or Class --> methods]  */
     //Uses:
     /* 1. more manageable and well organized code
      * 2.also helpful in calling the methods to be reused
      */
       public static void main(String[] args) {
        double radius = 3;
        double circleArea = calCircleArea(radius);
        System.out.println(circleArea);
    }

    public static double calCircleArea(double radius) {
        double area = 3.14 * radius * radius;
        return area; //return is use to send the values back to the method that called this current value
    }
/*this is the code for calculating the area of the circle here there is a class that is called as methods
 * this is the class and there are 2 methods 1 main and 1 to calculate the area of the circle[calcircleArea]
 * the calcircleArea method has to take arguments for the respective method variables that if not inputed cant
 * be calculated[we are calling the method calCircleArea and passing the values for radius]
 */
}
