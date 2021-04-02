package Java_Programming_Interview_Questions;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int num[]={1,3,4,5,6};
        int sum=0;
        for (int i=0;i< num.length;i++){
            sum=sum+num[i];
        }
        int sum1=0;
        for (int j=1;j<=6;j++){
            sum1=sum1+j;
        }
        System.out.println("The missing number is:"+(sum1-sum));
    }
}
