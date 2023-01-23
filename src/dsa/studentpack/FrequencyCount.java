package dsa.studentpack;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
//        int[] frq = new int[]{2, 4, 1, 1, -1,-1,-1,1,-1};
//        1 -> 2 , 2 -> 4, 8 -> 1, 3 -> 1, 5 -> 1
        int[] freq = new int[arr.length];
        int count;
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }

        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println("The count of " + arr[i] + " = " + freq[i]);
            }
            if (freq[i] > 1) {
                System.out.println(arr[i]);
            }
        }
//        for (int i : freq) {
//            if (i != visited) {
//                System.out.println("The count of " + arr[i] + " = " + freq[i]);
//            }
//        }
    }
}
