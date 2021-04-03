package Java_Programming_Interview_Questions;

public class PrimeNumber {
    //lowest prime number is 2
    //prime number is a number which is whole number greater than 1 and can only be divided by itself and 1
    public static boolean isPrimeNumber(int num){
        //edge/corner cases
        if (num<=1){
            return false;
        }
        for (int i=2;i<num;i++){
            if (num % i ==0)
                return false;
        }
        return true;
    }
    //to print prime numbers upto given number
    public static void getPrimeNumber(int num){
        for (int i=2;i<=num;i++){
            if (isPrimeNumber(i)){
                System.out.println(i+" "+"is a prime number");
            }else{
                System.out.println(i+" "+"is not a prime number");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("3 is prime number"+" "+isPrimeNumber(3));
        getPrimeNumber(20);
    }

}
