package Java_Programming_Interview_Questions;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=987654;
        //reverse integer by using while loop
        int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
        //reverse integer by using StringBuffer
        int num1=987654;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
