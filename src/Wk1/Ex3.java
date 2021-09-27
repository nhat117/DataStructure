package Wk1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/*
An array A contains N unique elements. Without sorting the list, determine if if contains N consecutive elements. For example:
A = {5, 3, 4, 1, 2} Output: true as array contains elements from 1 to 5
A = {47, 43, 45, 44, 46} Output: true as array contains 43 to 47
A = {6, 7, 5, 9} Output: false

*/
public class Ex3 {
    public static boolean isConsec(int [] arr) {
        //Get the length
        int len = arr.length;
        //False condition
        if (len < 1) return false;

        //Get the max and min of the array
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();

        // If max + min = -1 check all of the element
        if(max - min == len - 1) {
            //map the ith element of input array arr[] to the flag array by using arr[i] – min as the index in visited[].
            boolean [] flag = new boolean[len];
            for (int i = 0; i < len; i ++) {
                //If the condition already occur
                if(flag[arr[i] - min]) {
                    return false;
                }
                flag[arr[i] - min] = true;
            }
            //If all elements occur once, then return true
            return true;
        }
        //If max - min + 1 != len
        return false;
    }
    //Driver code
    public static void main(String[] args) {
        int arr[] = {-1, 4, 2, 3, 1, 1};
        System.out.println(isConsec(arr));
    }
}
