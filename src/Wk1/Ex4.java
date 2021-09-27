package Wk1;

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
