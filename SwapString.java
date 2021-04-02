package Java_Programming_Interview_Questions;

public class SwapString {
    public static void main(String[] args) {
        String a="Hello";
        String b="World";
        System.out.println("Before Swapping");
        System.out.println("Value of a is:"+a);
        System.out.println("Value of b is:"+b);
        //1.Append a and b
        a=a+b;
        //2.Store initial value of string a to string b
        b=a.substring(0,a.length()-b.length());
        //3.Store initial value of String b to String a
        a=a.substring(b.length());
        System.out.println("After Swapping");
        System.out.println("Value of a is:"+a);
        System.out.println("Value of b is:"+b);
    }
}
