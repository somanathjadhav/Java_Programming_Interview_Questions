package Java_Programming_Interview_Questions;

public class RemoveJunkOrSpecialChar {
    public static void main(String[] args) {
        String s="@%$Selenium%*";
        //by using regular expression
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
