package ProjectGurgram.Leetcodes.SlidingWindowTechnique;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, -12, 16};
        int k = 3;
        System.out.println(firstNegativeNumber(arr, k));
    }

    public static long[] firstNegativeNumber(int[] arr, int K) {
        List<Long> list = new ArrayList<>();
        long res[] = new long[arr.length - K + 1];
        int pointer = 0;
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] < 0) {
                list.add((long) arr[j]);
            }
            if (j - i + 1 < K) {
                j++;
            } else {
                if (list.size() == 0) {
                    res[pointer++] = 0;
                } else {
                    long storedValue = list.get(0);
                    res[pointer++] = storedValue;
                    if (storedValue == arr[i]) {
                        list.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        return res;
    }
}

