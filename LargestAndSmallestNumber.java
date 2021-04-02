package Java_Programming_Interview_Questions;

import java.util.Arrays;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        int num[] = {50, 100, 500, -100, 30};
        int smallest = num[0];
        int largest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            } else if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("\n given array is:"+ Arrays.toString(num));
        System.out.println("largest number is:"+largest);
        System.out.println("smallest number is:"+smallest);
    }
}
