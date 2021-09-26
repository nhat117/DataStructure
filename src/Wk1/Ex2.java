package Wk1;

import java.util.ArrayList;

/*
An array A of length 99 contains contains unique elements between 1 and 100. Describe an efficient algorithm to find the missing integer.
 */
public class Ex2 {
    public static int findMissing(Integer[] array)  {
        int n = array.length + 1;
        //Find the sum from 1 to n
        int sum = 0;
        for(int i = 1; i <= n; i ++) {
            sum+=i;
        }
        //Find sum total value in the array
        int sumarr = 0;
        for(int value : array) {
            sumarr += value;
        }
        //return the missing vallue
        return sum - sumarr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int missing = 1;
        for (int i = 1; i < 99; i ++ ) {
            if (i != missing) {arr.add(i);}
        }
        //Testing the unit
        if(findMissing(arr.toArray(new Integer[0])) == missing) {
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
