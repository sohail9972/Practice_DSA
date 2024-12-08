# Circular Array Transformation

## Problem Description

Given an integer array `nums` representing a circular array, create a new array `result` of the same size based on the following rules:

1. **If `nums[i] > 0`:**
    - Move `nums[i]` steps to the right in the circular array.
    - Set `result[i]` to the value of the index where you land.

2. **If `nums[i] < 0`:**
    - Move `abs(nums[i])` steps to the left in the circular array.
    - Set `result[i]` to the value of the index where you land.

3. **If `nums[i] == 0`:**
    - Set `result[i] = nums[i]`.

Since the array is circular:
- Moving past the last element wraps around to the beginning.
- Moving before the first element wraps back to the end.

---

## Solution Logic

### Circular Movement
1. **Rightward Movement (`nums[i] > 0`)**:
    - Compute the new index as:
      ```
      newIndex = (i + nums[i]) % n
      ```

2. **Leftward Movement (`nums[i] < 0`)**:
    - Compute the new index as:
      ```
      newIndex = (i + nums[i] + n) % n
      ```
    - Adding `n` ensures non-negative indices.

3. **No Movement (`nums[i] == 0`)**:
    - Directly set:
      ```
      result[i] = nums[i]