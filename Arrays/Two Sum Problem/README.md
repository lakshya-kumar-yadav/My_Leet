# Two Sum

**LeetCode Problem:** [Two Sum](https://leetcode.com/problems/two-sum/)  
**Difficulty:** Easy  
**Topics:** Array, HashMap

## Problem Description

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

- Each input has exactly one solution.
- You cannot use the same element twice.
- You can return the answer in any order.

## Examples

### Example 1

**Input:**
```text
nums = [2, 7, 11, 15], target = 9
```

**Output:**
```text
[0, 1]
```

**Explanation:** `nums[0] + nums[1] = 2 + 7 = 9`.

### Example 2

**Input:**
```text
nums = [3, 2, 4], target = 6
```

**Output:**
```text
[1, 2]
```

**Explanation:** `nums[1] + nums[2] = 2 + 4 = 6`.

### Example 3

**Input:**
```text
nums = [3, 3], target = 6
```

**Output:**
```text
[0, 1]
```

**Explanation:** `nums[0] + nums[1] = 3 + 3 = 6`.

## Constraints

- `2 <= nums.length <= 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`
- `-10⁹ <= target <= 10⁹`
- Only one valid answer exists.

## Approach: HashMap

Use a HashMap to store previously visited numbers and their corresponding indices.

1. Initialize an empty HashMap.
2. Iterate through the array.
3. Calculate the complement: `target - nums[i]`.
4. Check whether the complement exists in the HashMap.
5. If found, return the stored index and the current index.
6. Otherwise, store the current number and its index in the HashMap.

This approach avoids checking every possible pair and provides an efficient solution.

## Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Single traversal of the array |
| Space | O(n) | HashMap stores up to n elements |

## Solution

**Language:** Java  
**Data Structure:** HashMap

See the Java implementation in `TwoSum.java`.

---

*Part of my LeetCode problem-solving journey — focusing on data structures, algorithms, and writing efficient solutions.*
