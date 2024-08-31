package ProjectGurgram.Leetcodes.SlidingWindowTechnique;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlindingwindowMaximum239 {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int window = 3;
        System.out.println(maxSlidingWindow(arr,window));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] storingMaximumofSubArray = new int[n - k + 1];
        int start = 0;

//      Deque will be storing the Indexes
        Deque<Integer> dqueue = new ArrayDeque<>();
            for(int i = 0; i<n;i++) {
                {
                    if (!dqueue.isEmpty() && dqueue.peek() == i - k) {
                        dqueue.poll();
                    }
                    while (!dqueue.isEmpty() && nums[dqueue.peekLast()] < nums[i]) {
                        dqueue.pollLast();
                    }
                    dqueue.offer(i);
                    if (i >= k - 1) {
                        storingMaximumofSubArray[start++] = nums[dqueue.peek()];
                    }
                }

            }
            return storingMaximumofSubArray;
        }
    }
