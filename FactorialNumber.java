package Java_Programming_Interview_Questions;

public class FactorialNumber {
    //factorial of 3=3*2*1=6
    //factorial of 4=4*3*2*1=24
    //factorial of 1=1
    //factorial of 0=1
    //1.Finding Factorial without recursive function: use for loop(non recursive)
    public static int factorial(int num){
        int fact=1;
        if (num==1)
            return 1;
        for (int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    //2.with recursive function--a function is calling itself
    public static int fact(int num){
        if(num==0)
            return 1;
        else
            return (num*fact(num-1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println("*******");
        System.out.println(fact(5));
        System.out.println(fact(0));
        System.out.println(fact(1));
        System.out.println(fact(2));
    }
}
