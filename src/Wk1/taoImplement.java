package Wk1;

public class taoImplement {
    public static boolean bSeaerch(int [] arr, int l, int r, int x) {
        if(r >= l) {
            int mid = l + (r-l)/2 ;
            if (arr[mid] == x) {
                System.out.println("Index: " + mid);
                return true;
            }
            if (x < arr[mid]) {
                return bSeaerch(arr, l, mid -1, x);
            }
            //If x> arr[mid]
            return bSeaerch(arr, mid + 1,r, x);
        }
        return false;
    }

    public  static void main(String[] args) {
        int [] arr = {2,5,4,6,8,10};
        int find = 8;
        for(int i: arr) {
            System.out.println(i);
        }
        System.out.println(bSeaerch(arr,0, arr.length -1, find));
    }
}
