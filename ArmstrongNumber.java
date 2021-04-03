package Java_Programming_Interview_Questions;

public class ArmstrongNumber {
    public static void isArmstrongNumber(int num){
        System.out.println("The Given Number is:"+num);
        int cube=0;
        int r;
        int t;
        t=num;
        while (num>0){
            r=num%10;
            num=num/10;
            cube=cube+(r*r*r);
        }
        if (t==cube){
            System.out.println("This number is Armstrong Number");
        }else {
            System.out.println("This number is not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(199);
        isArmstrongNumber(370);
        isArmstrongNumber(0);
        isArmstrongNumber(1);
    }
}
