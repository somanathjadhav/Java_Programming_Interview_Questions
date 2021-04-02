package Java_Programming_Interview_Questions;

public class ReverseString {
    public static void main(String[] args) {
        String s="Selenium";
        int length=s.length();
        String rev=" ";
        for (int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        //by using string buffer
        StringBuffer sb= new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
