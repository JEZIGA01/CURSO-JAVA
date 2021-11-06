package PROVAS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TESSTE3 {

    static void recursiveSum(ArrayList<Integer> arr, int target, ArrayList<Integer> partialArr) {
        int s = 0;
        for (int x : partialArr) s += x;
        if (s == target) {
            System.out.println("True");
            System.exit(0);
        }
        if (s >= target)
            return;

        for (int i = 0; i < arr.size(); i++) {
            var remaining = new ArrayList<Integer>();
            int n = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) remaining.add(arr.get(j));
            var partialArrRecursive = new ArrayList<>(partialArr);
            partialArrRecursive.add(n);
            recursiveSum(remaining, target, partialArrRecursive);

        }
    }

    public static void main(String[] args) {
        Integer[] arr = {3,5,-1,8,12};
        int target = Arrays.stream(arr).sorted()
                .mapToInt(v -> v)
                .max()
                .orElse(0);
        recursiveSum(new ArrayList<>(Arrays.asList(arr)), target, new ArrayList<>());
    }
}
