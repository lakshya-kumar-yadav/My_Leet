
# Container With Most Water

## LeetCode Problem
[Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

**Difficulty:** Medium

**Topics:** Array, Two Pointers, Greedy

---

## Problem Description

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i-th` line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container that can hold the maximum amount of water.

Return the maximum amount of water a container can store.

**Note:** You may not slant the container.

### Examples

**Example 1:**

**Input:**
```text
height = [1,8,6,2,5,4,8,3,7]
```

**Output:**
```text
49
```

**Explanation:**

The maximum water can be stored between the lines at indices `1` and `8`.

- Width = 8 - 1 = 7
- Height = min(8, 7) = 7
- Area = 7 × 7 = 49

**Example 2:**

**Input:**
```text
height = [1,1]
```

**Output:**
```text
1
```

**Explanation:**

The width between the two lines is 1, and the minimum height is 1.

Therefore, the maximum area is 1.

### Constraints

- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

---

## Approach

### 1. Two Pointers Technique

- Initialize two pointers:
  - `left = 0` (first element)
  - `right = height.length - 1` (last element)
- Calculate the width between the two pointers.
- Find the minimum height between the two lines.
- Calculate the current container area using:

  `Area = (right - left) * min(height[left], height[right])`

- Update the maximum area whenever a larger area is found.
- Move the pointer pointing to the shorter line inward because moving the taller line cannot improve the container's limiting height.
- Repeat until both pointers meet.

### 2. Return the Result

Return the maximum area calculated during the traversal.

---

## Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time Complexity | O(n) | Each pointer traverses the array at most once. |
| Space Complexity | O(1) | Only two pointers and a variable for maximum area are used. |

---

## Solution

**Language:** Java

**Data Structure:** Array

**Algorithm:** Two Pointers (Greedy)

**File:** `ContainerWithMostWater.java`

---

*Continuously learning, solving, and improving problem-solving skills through my LeetCode journey.*