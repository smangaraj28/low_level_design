package array;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creation of ArrayList
        ArrayList<Integer> scores = new ArrayList<>();
//        ArrayList<int> scoreList = new ArrayList<>(); // not possible

        List<String> names = new ArrayList<>();

        scores.add(12);
        scores.add(99);
        scores.add(100);

//        scores.remove(1);

        System.out.println(scores.get(1)); // arr[1]
        scores.set(1, 104); // arr[1] = 104;

        System.out.println(scores.size()); // size of the arraylist

        // for loop on arrayList
        for(int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }

        System.out.println(scores);

//        difference b/w int ( primitive data type ) vs Integer ( class )

    }
}
