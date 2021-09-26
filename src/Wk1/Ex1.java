package Wk1;
/*
Problem 1
Describe an algorithm to find the second largest element in array A - without sorting the array
 */

public class Ex1 {

    public static void secondLargest(int[] arr) {
        int  second;
        //Initialize avariable to store the second largest
        int max = second = Integer.MIN_VALUE;

        //Find the largest
        for(int i = 0; i < arr.length; i ++) {
            max = Math.max(max, arr[i]);
        }

        //Find the second lardest
        for(int i  =0; i < arr.length; i ++) {
            //Checking if the largekst
            if(arr[i] != max) {
                second = Math.max(second, arr[i]);
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest");
        } else {
            System.out.println("Second largest: " + second);
        }
    }

    public static void main(String[] args) {
        int [] arr = {4,3,12,1,1,5,5};
        secondLargest(arr);
    }
}
