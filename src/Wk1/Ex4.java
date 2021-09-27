package Wk1;
/*
Consider the following operations on an arbitrary positive integer, N

If the N is even, divide it by two (i.e. N/2) and if N is odd, triple it and add one (i.e. 3*N +1)
Now form a sequence by performing this operation repeatedly, beginning with any positive integer, and taking the result at each step as the input to the next and continue until the number 1 is reached.
For instance, starting with n = 12, one gets the sequence 12, 6, 3, 10, 5, 16, 8, 4, 2, 1.  When n = 19, the sequence is much longer and is as follows: 19, 58, 29, 88, 44, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1.

Write a program that for all the numbers between 1 and 100 calculates the number of steps it takes to reach 1 and print out the number of steps in a table
 */
public class Ex4 {
    //Check the step of each number to 1
    public static int stepcalc(int in) {
//        System.out.print(in + ", ");
        //Base case
        if (in == 1) {
            return 0;
        }
        //IF even
        if(in % 2 == 0) {
            return stepcalc(in/2) + 1 ;
            //If oods
        } else {
            return stepcalc(in * 3 + 1) + 1;
        }
    }

    public static  void printTable(int n) {
        //Print the header
        System.out.println("Number    Step");
        //Print the content
        for (int i = 1; i <= n; i ++) {
            System.out.printf("%3d   %6d\n", i, stepcalc(i));
        }
    }
//Driver Code
    public static void main(String[] args) {
        int n = 100;
        printTable(n);
//        int x = stepcalc(18);
//        System.out.println("\n" + x);
    }
}
