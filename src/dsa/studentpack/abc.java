package dsa.studentpack;

import java.util.Arrays;

public class abc {
    public static void main(String ar[]) {
        int arr[] = {5, 5};
        int k = 10;
        System.out.println(checkSum(arr, k)); // true
    }

    public static boolean checkSum(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int sum = 0;
        while (i < j) {
            sum = arr[i] + arr[j];
            if (sum == k && arr[i] != arr[j]) {
                return true;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}

//O(nlogn)
// Sort the array [1,2,3,4,5,6] -> nlogn
// 2 pointers ->
//
//1 + 6 = 7
// 7 < 10
//
//2 + 6 = 8
//
//8 < 10

// maps O(n) -> T:C O(n)
//1->1
//        2->1




