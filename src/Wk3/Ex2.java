package Wk3;


import java.util.HashSet;

/*
METHOD 3 (A Juggling Algorithm)
This is an extension of method 2. Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.
Here is an example for n =12 and d = 3. GCD is 3 and
 */
public class Ex2 {
    void leftRotate(int arr[], int k, int size)
    {
        /* To handle if d >= n */
        k = k % size;
        int i, j, n, temp;
        int gcd = gcd(k, size);
        for (i = 0; i < gcd; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                n = j + k;
                if (n>= size)
                    n= n - size;
                if (n == i)
                    break;
                arr[j] = arr[n];
                j = n;
            }
            arr[j] = temp;
        }
    }

    int gcd(int a, int b) {
        if( b == 0) {
            return a;
        } else {
            return gcd(b, a %b);
        }
    }

    //Maximum different
    static int maxdiff(int[] arr) {
        int min = arr[0];
        int maxdiff = arr[1] - arr[0];
        int sum = maxdiff;
        int maxSum = sum;
        //Determine the max diff
        for(int i = 1; i < arr.length - 1; i++) {
            maxdiff = arr[i + 1] - arr[i];
	        if(sum> 0) {
	            sum += maxdiff;
            } else {
	            sum = maxdiff;
            }
	        if (sum > maxSum) {
	            maxSum = sum;
            }
        }
        return Math.abs(maxSum);
    }

    static  void findPair(int[] array, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i ++) {
            //Check condition
            if(set.contains(array[i] + diff) ) {
                System.out.printf("\n Max different of %d and %d is %d"  , array[i], array[i] + diff, diff);
                break;
            }else if(set.contains(array[i] - diff)) {
                System.out.printf("\nMax different of %d and %d is %d" , array[i], array[i] - diff, diff);
                break;
            }
            //if not found, add to hash set
            set.add(array[i]);
        }
    }

    public static void main(String[] args) {
        int [] array =  {14, 12, 70, 15, 95, 65, 22, 99, 8};
        Ex2 k = new Ex2();
        k.leftRotate(array, 1,array.length);
        for(int i : array) {
            System.out.printf("%d ", i);
        }
        findPair(array,maxdiff(array));
    }
}
