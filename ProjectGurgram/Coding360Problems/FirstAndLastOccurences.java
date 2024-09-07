package ProjectGurgram.Coding360Problems;

import java.util.ArrayList;

public class FirstAndLastOccurences {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(45);
        int n=5;
        int k=2;
        System.out.println(firstAndLastPosition(list,n,k));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(arr, n, k);
        result[1] = findLastOccurrence(arr, n, k);
        return result;
    }

    private static int findFirstOccurrence(ArrayList<Integer> arr, int n, int k) {
        int start = 0, end = n - 1;
        int firstOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == k) {
                firstOccurrence = mid;
                end = mid - 1; // Move to the left half
            } else if (arr.get(mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

    private static int findLastOccurrence(ArrayList<Integer> arr, int n, int k) {
        int start = 0, end = n - 1;
        int lastOccurrence = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == k) {
                lastOccurrence = mid;
                start = mid + 1; // Move to the right half
            } else if (arr.get(mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastOccurrence;
    }
}
