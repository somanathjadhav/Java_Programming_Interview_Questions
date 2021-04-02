package Java_Programming_Interview_Questions;

public class SwapIntegers {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        //using third temporary variable
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("Value of a after swapping:"+a);
        System.out.println("Value of b after swapping:"+b);
        System.out.println("*******");
        //using + operator
        int x=20;
        int y=25;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("value of x after swapping:"+x);
        System.out.println("Value of y after swapping:"+y);
        System.out.println("*******");
        //using * operator
        int c=2;
        int d=4;
        c=c*d;
        d=c/d;
        c=c/d;
        System.out.println("Value of c after swapping:"+c);
        System.out.println("Value of d after swapping:"+d);
        System.out.println("*******");
        //by using XOR operator
        int g=3;
        int h=8;
        g=g^h;
        h=g^h;
        g=g^h;
        System.out.println("Value of g after swapping:"+g);
        System.out.println("Value of h after swapping:"+h);
    }
}
