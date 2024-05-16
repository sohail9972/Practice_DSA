package ProjectGurgram.Leetcodes;

public class FindDuplicatesusingkunal {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 2};
        findduplicates(a);

    }

    static int findduplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctindex = arr[i] - 1;
                if (arr[i] != arr[correctindex]) {
                    swap(arr, i, correctindex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }


        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }


