package Wk3;

public class Ex1 {

//implement interpolation search
    /*
    Rest of the Interpolation algorithm is the same except the above partition logic.
Step1: In a loop, calculate the value of “pos” using the probe position formula.
Step2: If it is a match, return the index of the item, and exit.
Step3: If the item is less than arr[pos], calculate the probe position of the left sub-array. Otherwise calculate the same in the right sub-array.
Step4: Repeat until a match is found or the sub-array reduces to zero.
Below is the implementation of algorithm.
     */
    public static int search(int[] arr, int start, int end, int targe) {
        int pos;
        if (start <= end && targe >= arr[start] && targe <= arr[end]) {
            //Formular to calculate the position of the target element
            pos = start + ((end - start) /(arr[end] - arr[start]) * (targe - arr[start]));
            //If target found
            if(arr[pos] == targe) {
                return pos;
            }
            //Recursively call the search to patition the array
            if (arr[pos] < targe) {
                return search(arr, pos + 1, end, targe);
            } else if(arr[pos] > targe) {
                return search(arr, start, pos - 1,targe);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4};
        int x = search(array,0, array.length - 1 ,2);
        System.out.println(x);
    }
}
