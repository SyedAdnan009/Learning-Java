public class Example2 {
    public static int a = 5;//global variable
    public static void main(String[] args) {
        int x=5;//this code is an example of a local and block variable scope
        if(x==5){
            int y=10;//block scope
            System.out.println(y);

        }
        System.out.println(x);//can be use after even closing if block this is because of local scope
        System.out.println(a);
        //System.out.println(y);
    }
    public static void first(String[] args) {

        System.out.println(a);
    }
}
// this helped me in understanding the scope variation that will determine the use of variable under the clousour 
//of the paranthesis{}